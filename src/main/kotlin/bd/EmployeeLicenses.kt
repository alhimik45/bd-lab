package bd

import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import test.generated.tables.pojos.DriverLicenseView
import test.generated.tables.pojos.ExamView
import test.generated.Tables.DRIVER_LICENSE_VIEW
import test.generated.Tables.EXAM_VIEW
import tornadofx.*
import java.util.*

class EmployeeLicenses : View("Учет водительских удостоверений") {
    override val root: TabPane by fxml()
    private val licenseTable: TableView<DriverLicenseView> by fxid()
    private val fio: TableColumn<DriverLicenseView, String> by fxid()
    private val cat: TableColumn<DriverLicenseView, String> by fxid()
    private val num: TableColumn<DriverLicenseView, String> by fxid()
    private val date: TableColumn<DriverLicenseView, Date> by fxid()
    private val examTable: TableView<ExamView> by fxid()
    private val fio1: TableColumn<ExamView, String> by fxid()
    private val ocenka: TableColumn<ExamView, String> by fxid()
    private val date1: TableColumn<ExamView, Date> by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("fio")
        cat.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("cat")
        num.cellValueFactory = PropertyValueFactory<DriverLicenseView, String>("licenseid")
        date.cellValueFactory = PropertyValueFactory<DriverLicenseView, Date>("dateofissue")
        fio1.cellValueFactory = PropertyValueFactory<ExamView, String>("fio")
        ocenka.cellValueFactory = PropertyValueFactory<ExamView, String>("results")
        date1.cellValueFactory = PropertyValueFactory<ExamView, Date>("date")
        updateDrLi()
        updateEx()
    }

    fun updateDrLi() {
        val data = licenseTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(DRIVER_LICENSE_VIEW)?.fetch()?.into(DriverLicenseView::class.java)!!.asIterable())
    }

    fun updateEx() {
        val data = examTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(EXAM_VIEW)?.fetch()?.into(ExamView::class.java)!!.asIterable())
    }
}
