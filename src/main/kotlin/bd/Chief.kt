package bd

import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.FX.Companion.lock
import tornadofx.View
import java.util.*


class Chief : View("Начальника") {
    override val root: TabPane by fxml()


    private val distribTable: TableView<AllDistr> by fxid()
    private val employeeTable: TableView<EmployeView> by fxid()
    private val postTable: TableView<Postdps> by fxid()
    private val searchEmployee: TextField by fxid()
    private val searchPost: TextField by fxid()

    private val fio: TableColumn<AllDistr, String> by fxid()
    private val fioM: TableColumn<EmployeView, String> by fxid()
    private val date: TableColumn<AllDistr, Date> by fxid()
    private val num: TableColumn<AllDistr, String> by fxid()
    private val numM: TableColumn<EmployeView, String> by fxid()
    private val posM: TableColumn<EmployeView, String> by fxid()
    private val post: TableColumn<AllDistr, String> by fxid()
    private val address: TableColumn<Postdps, String> by fxid()
    private val active: TableColumn<Postdps, Boolean> by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<AllDistr, String>("fio")
        fioM.cellValueFactory = PropertyValueFactory<EmployeView, String>("fio")
        date.cellValueFactory = PropertyValueFactory<AllDistr, Date>("dateorder")
        num.cellValueFactory = PropertyValueFactory<AllDistr, String>("personalid")
        numM.cellValueFactory = PropertyValueFactory<EmployeView, String>("personalid")
        posM.cellValueFactory = PropertyValueFactory<EmployeView, String>("name")
        post.cellValueFactory = PropertyValueFactory<AllDistr, String>("address")
        address.cellValueFactory = PropertyValueFactory<Postdps, String>("address")
        active.cellValueFactory = PropertyValueFactory<Postdps, Boolean>("active")
        upd()
        EventBus.on(Events.EMP_UPD) { updateMan() }
        EventBus.on(Events.POST_UPD) { updatePost() }
        searchEmployee.textProperty().addListener { _,_,_ ->
            updateMan()
        }
        searchPost.textProperty().addListener { _,_,_ ->
            updatePost()
        }
        root.selectionModel.selectedItem.selectedProperty().addListener { _ ->
            upd()
        }
    }

    private fun upd() {
        update()
        updateMan()
        updatePost()
    }

    fun update() {
        val data = distribTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.ALL_DISTR)?.fetch()?.into(AllDistr::class.java)!!.asIterable())
    }

    fun updateMan() {
        val data = employeeTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.EMPLOYE_VIEW)?.fetch()?.into(EmployeView::class.java)!!.filter { e ->
            val v = searchEmployee.text
            if (v == null || v.isEmpty()) {
                true
            } else {
                val lowerCaseFilter = v.toLowerCase().split(" ").filter { it.isNotBlank() }
                if (lowerCaseFilter.any{e.fio.toLowerCase().contains(it)}) {
                    true
                } else {
                    lowerCaseFilter.any{e.personalid.toLowerCase().contains(it)}
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
                lowerCaseFilter.any{e.address.toLowerCase().contains(it)}
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
        if (employeeTable.selectionModel.selectedItem == null){
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
        if (postTable.selectionModel.selectedItem == null){
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
}
