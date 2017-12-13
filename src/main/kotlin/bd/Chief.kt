package bd

import javafx.beans.property.SimpleStringProperty
import javafx.scene.control.*
import javafx.scene.control.cell.PropertyValueFactory
import javafx.stage.FileChooser
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.View
import java.io.FileOutputStream
import java.time.LocalDate
import java.util.*

class Chief : View("Начальник") {
    override val root: TabPane by fxml()


    private val distribTable: TableView<AllDistr> by fxid()
    private val employeeTable: TableView<EmployeView> by fxid()
    private val postTable: TableView<Postdps> by fxid()
    private val nars: TableView<BadsView> by fxid()
    private val searchEmployee: TextField by fxid()
    private val searchPost: TextField by fxid()
    private val searchAss: TextField by fxid()

    private val fio: TableColumn<AllDistr, String> by fxid()
    private val fioM: TableColumn<EmployeView, String> by fxid()
    private val date: TableColumn<AllDistr, Date> by fxid()
    private val num: TableColumn<AllDistr, String> by fxid()
    private val numM: TableColumn<EmployeView, String> by fxid()
    private val posM: TableColumn<EmployeView, String> by fxid()
    private val post: TableColumn<AllDistr, String> by fxid()
    private val address: TableColumn<Postdps, String> by fxid()
    private val active: TableColumn<Postdps, String> by fxid()
    private val nar: TableColumn<BadsView, String> by fxid()
    private val stat: TableColumn<BadsView, String> by fxid()
    private val place: TableColumn<BadsView, String> by fxid()
    private val insp: TableColumn<BadsView, String> by fxid()
    private val daten: TableColumn<BadsView, Date> by fxid()

    private val from: DatePicker by fxid()
    private val to: DatePicker by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<AllDistr, String>("fio")
        fioM.cellValueFactory = PropertyValueFactory<EmployeView, String>("fio")
        date.cellValueFactory = PropertyValueFactory<AllDistr, Date>("dateorder")
        num.cellValueFactory = PropertyValueFactory<AllDistr, String>("personalid")
        numM.cellValueFactory = PropertyValueFactory<EmployeView, String>("personalid")
        posM.cellValueFactory = PropertyValueFactory<EmployeView, String>("name")
        post.cellValueFactory = PropertyValueFactory<AllDistr, String>("address")
        address.cellValueFactory = PropertyValueFactory<Postdps, String>("address")
        nar.cellValueFactory = PropertyValueFactory<BadsView, String>("fio")
        stat.cellValueFactory = PropertyValueFactory<BadsView, String>("articlecop")
        place.cellValueFactory = PropertyValueFactory<BadsView, String>("addressvioalation")
        insp.cellValueFactory = PropertyValueFactory<BadsView, String>("fioi")
        daten.cellValueFactory = PropertyValueFactory<BadsView, Date>("date")
        active.setCellValueFactory { param ->
            SimpleStringProperty(if (param.value.active) "Да" else "Нет")
        }
        upd()
        EventBus.on(Events.EMP_UPD) { updateMan() }
        EventBus.on(Events.POST_UPD) { updatePost() }
        EventBus.on(Events.ASS_UPD) { update() }
        from.valueProperty().addListener { _, _, _ ->
            updateNars()
        }
        to.valueProperty().addListener { _, _, _ ->
            updateNars()
        }
        searchEmployee.textProperty().addListener { _, _, _ ->
            updateMan()
        }
        searchPost.textProperty().addListener { _, _, _ ->
            updatePost()
        }
        searchAss.textProperty().addListener { _, _, _ ->
            update()
        }
        root.selectionModel.selectedItem.selectedProperty().addListener { _ ->
            upd()
        }
    }

    private fun upd() {
        update()
        updateMan()
        updatePost()
        updateNars()
    }

    fun updateNars() {
        val data = nars.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.BADS_VIEW)?.fetch()?.into(BadsView::class.java)!!.filter { e ->
            e.date.after(fromm(from.value, java.sql.Date(0L))) &&
                    e.date.before(fromm(to.value, java.sql.Date(Long.MAX_VALUE)))
        })
    }

    fun fromm(d: LocalDate?, def: java.sql.Date): java.sql.Date {
        if (d == null)
            return def
        return java.sql.Date.valueOf(d)
    }

    fun update() {
        val data = distribTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.ALL_DISTR)?.fetch()?.into(AllDistr::class.java)!!.filter { e ->
            val v = searchAss.text
            if (v == null || v.isEmpty()) {
                true
            } else {
                val lowerCaseFilter = v.toLowerCase().split(" ").filter { it.isNotBlank() }
                if (lowerCaseFilter.any { e.fio.toLowerCase().contains(it) }) {
                    true
                } else {
                    lowerCaseFilter.any { e.address.toLowerCase().contains(it) }
                }
            }
        })
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

    fun saveNars() {
        val fileChooser = FileChooser()
        fileChooser.title = "Создать отчет"
        val extFilter = FileChooser.ExtensionFilter("XLSX files (*.xlsx)", "*.xlsx")
        fileChooser.extensionFilters.add(extFilter)
        val file = fileChooser.showSaveDialog(currentWindow) ?: return
        val myWorkBook = XSSFWorkbook()
        val mySheet = myWorkBook.createSheet("Отчёт")
        var rowNum = mySheet.lastRowNum
        var row = mySheet.createRow(rowNum++)
        var cellnum = 0
        var cell = row.createCell(cellnum++)
        cell.setCellValue("")
        cell = row.createCell(cellnum++)
        cell.setCellValue("Нарушитель")
        cell = row.createCell(cellnum++)
        cell.setCellValue("Статья")
        cell = row.createCell(cellnum++)
        cell.setCellValue("Инспектор")
        cell = row.createCell(cellnum++)
        cell.setCellValue("Место нарушения")
        cell = row.createCell(cellnum)
        cell.setCellValue("Дата нарушения")
        for (o in nars.items) {
            row = mySheet.createRow(rowNum++)
            cellnum = 0
            cell = row.createCell(cellnum++)
            cell.setCellValue(rowNum.toDouble())
            cell = row.createCell(cellnum++)
            cell.setCellValue(o.fio)
            cell = row.createCell(cellnum++)
            cell.setCellValue(o.articlecop)
            cell = row.createCell(cellnum++)
            cell.setCellValue(o.fioi)
            cell = row.createCell(cellnum++)
            cell.setCellValue(o.addressvioalation)
            cell = row.createCell(cellnum)
            cell.setCellValue(o.date)
        }
        for (i in 0..7) {
            mySheet.autoSizeColumn(i)
        }
        myWorkBook.write(FileOutputStream(file))
    }
}
