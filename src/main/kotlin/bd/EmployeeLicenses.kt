package bd

import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import test.generated.tables.pojos.DriverLicenseView
import test.generated.tables.pojos.ExamView
import test.generated.Tables.DRIVER_LICENSE_VIEW
import test.generated.Tables.EXAM_VIEW
import tornadofx.*
import java.util.*
import javafx.collections.transformation.FilteredList



class EmployeeLicenses : View("Учет водительских удостоверений") {
    override val root: TabPane by fxml()
    private val licenseTable: TableView<DriverLicenseView> by fxid()
    private val fio: TableColumn<DriverLicenseView, String> by fxid()
    private val cat: TableColumn<DriverLicenseView, String> by fxid()
    private val num: TableColumn<DriverLicenseView, String> by fxid()
    private val date: TableColumn<DriverLicenseView, Date> by fxid()
    private val examTable: TableView<ExamView> by fxid()
    private val fio1: TableColumn<ExamView, String> by fxid()
    private val result: TableColumn<ExamView, String> by fxid()
    private val date1: TableColumn<ExamView, Date> by fxid()
    private val searchLicenses: TextField by fxid()
    private val searchExam: TextField by fxid()
    private val dataDrLi = licenseTable.items
    private val dataEx = examTable.items
    private var searchDrLi = FilteredList<DriverLicenseView>(dataDrLi){ _ -> true}
    private var searchEx = FilteredList<ExamView>(examTable.items){ _ -> true}

    init {
        fio.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("fio")
        cat.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("cat")
        num.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("licenseid")
        date.cellValueFactory = PropertyValueFactory<DriverLicenseView, Date>("dateofissue")
        fio1.cellValueFactory = PropertyValueFactory<ExamView, String>("fio")
        result.cellValueFactory = PropertyValueFactory<ExamView, String>("results")
        date1.cellValueFactory = PropertyValueFactory<ExamView, Date>("date")
        updateDrLi()
        updateEx()
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
    }

    fun updateDrLi() {
        dataDrLi.clear()
        dataDrLi.addAll(Logic.create!!.select()?.from(DRIVER_LICENSE_VIEW)?.fetch()?.into(DriverLicenseView::class.java)!!.asIterable())
        searchDrLi = FilteredList<DriverLicenseView>(dataDrLi){ _ -> true}
        licenseTable.items = searchDrLi
    }

    fun updateEx() {
        dataEx.clear()
        dataEx.addAll(Logic.create!!.select()?.from(EXAM_VIEW)?.fetch()?.into(ExamView::class.java)!!.asIterable())
        searchEx = FilteredList<ExamView>(examTable.items){ _ -> true}
        examTable.items = searchEx
    }
}