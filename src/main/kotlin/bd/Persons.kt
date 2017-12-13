package bd

import com.sun.jmx.snmp.EnumRowStatus.active
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import org.jooq.Table
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.View
import java.util.*


class Persons : View("Физические лица") {
    override val root: BorderPane by fxml()


    private val flTable: TableView<Person> by fxid()
    private val searchFl: TextField by fxid()

    private val fio: TableColumn<Person, String> by fxid()
    private val date: TableColumn<Person, Date> by fxid()
    private val nom: TableColumn<Person, String> by fxid()
    private val ser: TableColumn<Person, String> by fxid()
    private val address: TableColumn<Person, String> by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<Person, String>("fio")
        date.cellValueFactory = PropertyValueFactory<Person, Date>("daybirth")
        nom.cellValueFactory = PropertyValueFactory<Person, String>("passportid")
        ser.cellValueFactory = PropertyValueFactory<Person, String>("pasportseries")
        address.cellValueFactory = PropertyValueFactory<Person, String>("homeaddress")
        update()
        EventBus.on(Events.FL_UPD) { update() }
        searchFl.textProperty().addListener { _, _, _ ->
            update()
        }
    }

    fun update() {
        val data = flTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.EMPLOYE_VIEW)?.fetch()?.into(EmployeView::class.java)!!.filter { e ->
            val v = searchEmployee.text
            if (v == null || v.isEmpty()) {
                true
            } else {
                val lowerCaseFilter = v.toLowerCase().split(" ").filter { it.isNotBlank() }
                if (lowerCaseFilter.any { e.fio.toLowerCase().contains(it) }) {
                    true
                } else {
                    lowerCaseFilter.any { e.personalid.toLowerCase().contains(it) }
                }
            }
        })
    }

    fun updatePost() {
        val data = postTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.POSTDPS)?.fetch()?.into(Postdps::class.java)!!.filter { e ->
            val v = searchPost.text
            if (v == null || v.isEmpty()) {
                true
            } else {
                val lowerCaseFilter = v.toLowerCase().split(" ").filter { it.isNotBlank() }
                lowerCaseFilter.any { e.address.toLowerCase().contains(it) }
            }
        })
    }

    fun newPost() {
        PostForm().openModal(block = true)
    }

    fun newPid() {
        EmpForm().openModal(block = true)
    }

    fun editPid() {
        if (employeeTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val emp = employeeTable.selectionModel.selectedItem
        val p = Logic.create!!.select().from(Tables.PERSON).where(Tables.PERSON.PERSON_PK.eq(emp.personPk)).fetchOne().into(Person::class.java)
        val e = Logic.create!!.select().from(Tables.EMPLOYE).where(Tables.EMPLOYE.EMPLOYE_PK.eq(emp.employePk)).fetchOne().into(Employe::class.java)
        val lock = Logic.create!!.fetchOne("SELECT pg_try_advisory_lock(${Lock.PERSON.ordinal},${p.personPk});").into(Boolean::class.java)
        if (!lock) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        val lock2 = Logic.create!!.fetchOne("SELECT pg_try_advisory_lock(${Lock.EMP.ordinal},${e.employePk});").into(Boolean::class.java)
        if (!lock2) {
            Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.PERSON.ordinal},${p.personPk})")
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        EmpForm(p, e).openModal(block = true)
    }

    fun editPost() {
        if (postTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val p = postTable.selectionModel.selectedItem
        val lock = Logic.lock(Lock.POST, p.postdpsPk)
        if (!lock) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        PostForm(p).openModal(block = true)
    }

    fun addAssign() {
        AssignForm().openModal(block = true)
    }

    fun editAssign() {
        if (distribTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val p = distribTable.selectionModel.selectedItem
        val pp = Logic.create!!.select().from(Tables.ASSIGNMENT).where(Tables.ASSIGNMENT.ASSIGNMENT_PK.eq(p.assignmentPk)).fetchOne().into(Assignment::class.java)
        val lock = Logic.lock(Lock.ASS, p.assignmentPk)
        if (!lock) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        AssignForm(pp).openModal(block = true)
    }
}
