package bd

import javafx.collections.transformation.FilteredList
import javafx.embed.swing.SwingFXUtils
import javafx.scene.SnapshotParameters
import javafx.scene.chart.PieChart
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.stage.FileChooser
import test.generated.Tables
import test.generated.Tables.DRIVER_LICENSE_VIEW
import test.generated.Tables.EXAM_VIEW
import test.generated.tables.pojos.DriverLicenseView
import test.generated.tables.pojos.Driverlicense
import test.generated.tables.pojos.ExamView
import test.generated.tables.pojos.Examlist
import tornadofx.SmartResize
import tornadofx.View
import tornadofx.piechart
import java.util.*
import javax.imageio.ImageIO
import kotlin.collections.HashMap


class EmployeeLicenses : View("Учет водительских удостоверений") {
    override val root: TabPane by fxml()

    private val licenseTable: TableView<DriverLicenseView> by fxid()
    private val fio: TableColumn<DriverLicenseView, String> by fxid()
    private val cat: TableColumn<DriverLicenseView, String> by fxid()
    private val num: TableColumn<DriverLicenseView, String> by fxid()
    private val date: TableColumn<DriverLicenseView, Date> by fxid()
    private val chart: PieChart by fxid()

    private val examTable: TableView<ExamView> by fxid()
    private val fio1: TableColumn<ExamView, String> by fxid()
    private val result: TableColumn<ExamView, String> by fxid()
    private val date1: TableColumn<ExamView, Date> by fxid()

    private val searchLicenses: TextField by fxid()
    private val searchExam: TextField by fxid()

    private val dataDrLi = licenseTable.items
    private val dataEx = examTable.items
    private var searchDrLi = FilteredList<DriverLicenseView>(dataDrLi) { _ -> true }
    private var searchEx = FilteredList<ExamView>(examTable.items) { _ -> true }

    init {
        fio.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("fio")
        cat.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("cat")
        num.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("licenseid")
        date.cellValueFactory = PropertyValueFactory<DriverLicenseView, Date>("dateofissue")
        fio1.cellValueFactory = PropertyValueFactory<ExamView, String>("fio")
        result.cellValueFactory = PropertyValueFactory<ExamView, String>("results")
        date1.cellValueFactory = PropertyValueFactory<ExamView, Date>("date")

        licenseTable.columnResizePolicy = SmartResize.POLICY
        examTable.columnResizePolicy = SmartResize.POLICY

        updateDrLi()
        updateEx()


        //Enable search
        searchLicenses.textProperty().addListener { _, _, newValue ->
            searchDrLi.setPredicate { item ->
                if (newValue == null || newValue.isEmpty()) {
                    true
                } else {
                    val lowerCaseFilter = newValue.toLowerCase()

                    if (item.fio.toLowerCase().contains(lowerCaseFilter)) {
                        true
                    } else {
                        item.cat.toLowerCase().contains(lowerCaseFilter)
                    }
                }
            }
        }

        searchExam.textProperty().addListener { _, _, newValue ->
            searchEx.setPredicate { item ->
                if (newValue == null || newValue.isEmpty()) {
                    true
                } else {
                    item.fio.toLowerCase().contains(newValue.toLowerCase())
                }
            }
        }
        EventBus.on(Events.EXAM_UPD) { updateEx() }
        EventBus.on(Events.DRLI_UPD) { updateDrLi(); drawPie() }
        drawPie()
    }

    fun export(){
        val fileChooser = FileChooser()
        fileChooser.title = "Создать отчет"
        val extFilter = FileChooser.ExtensionFilter("PNG files (*.png)", "*.png")
        fileChooser.extensionFilters.add(extFilter)
        val file = fileChooser.showSaveDialog(currentWindow) ?: return
        val img = chart.snapshot(SnapshotParameters(), null)
        ImageIO.write(SwingFXUtils.fromFXImage(img, null), "png", file)
    }


    fun drawPie() {
        val cats = Logic.create!!.select(Tables.CATEGORY.NAME)
                .from(Tables.DRCATEG)
                .join(Tables.CATEGORY)
                .on(Tables.DRCATEG.CATEGORY_PK.eq(Tables.CATEGORY.CATEGORY_PK))
                .fetch()
                .into(String::class.java)
        val s = HashMap<String, Int>()
        cats.forEach{ c ->
            s[c] = s.getOrDefault(c,0) +1
        }
        chart.data.clear()
        chart.data.addAll(s.entries.map{ c ->
            PieChart.Data(c.key, c.value.toDouble())
        })
    }

    fun updateDrLi() {
        dataDrLi.clear()
        dataDrLi.addAll(Logic.create!!.select()?.from(DRIVER_LICENSE_VIEW)?.fetch()?.into(DriverLicenseView::class.java)!!.asIterable())
        searchDrLi = FilteredList<DriverLicenseView>(dataDrLi) { _ -> true }
        licenseTable.items = searchDrLi
    }

    fun updateEx() {
        dataEx.clear()
        dataEx.addAll(Logic.create!!.select()?.from(EXAM_VIEW)?.fetch()?.into(ExamView::class.java)!!.asIterable())
        searchEx = FilteredList<ExamView>(dataEx) { _ -> true }
        examTable.items = searchEx
    }

    fun addEx() {
        ExamForm().openModal(block = true)
    }

    fun modEx() {
        if (examTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val ex = examTable.selectionModel.selectedItem
        val e = Logic.create!!
                .select()
                .from(Tables.EXAMLIST)
                .where(Tables.EXAMLIST.EXAMLIST_PK.eq(ex.examlistPk))
                .fetchOne()
                .into(Examlist::class.java)
        if (!Logic.lock(Lock.EXAMLIST, ex.examlistPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        if (!Logic.lock(Lock.PERSON, ex.personPk)) {
            Logic.unlock(Lock.EXAMLIST, ex.examlistPk)
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }

        ExamForm(e).openModal(block = true)
    }

    fun addDrLi() {
        DrLiForm().openModal(block = true)
    }

    fun modDrLi() {
        if (licenseTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = licenseTable.selectionModel.selectedItem
        val l = Logic.create!!
                .select()
                .from(Tables.DRIVERLICENSE)
                .where(Tables.DRIVERLICENSE.DRIVERLICENSE_PK.eq(temp.driverlicensePk))
                .fetchOne()
                .into(Driverlicense::class.java)
        if (!Logic.lock(Lock.DRLI, temp.driverlicensePk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        if (!Logic.lock(Lock.PERSON, temp.personPk)) {
            Logic.unlock(Lock.DRLI, temp.driverlicensePk)
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        DrLiForm(l).openModal(block = true)
    }
}
