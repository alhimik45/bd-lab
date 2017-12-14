package bd

import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import test.generated.Tables
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.Appregistration
import test.generated.tables.pojos.Driverlicense
import test.generated.tables.pojos.VehicleView
import tornadofx.View
import java.util.*


class EmployeeCars : View("Учёт транспортных средств") {
    override val root: TabPane by fxml()
    private val vehicleTable: TableView<VehicleView> by fxid()
    private val regs: TableView<Appregistration> by fxid()
    private val licPlate: TableColumn<VehicleView, String> by fxid()
    private val model: TableColumn<VehicleView, String> by fxid()
    private val brand: TableColumn<VehicleView, String> by fxid()
    private val fio: TableColumn<VehicleView, String> by fxid()
    private val status: TableColumn<VehicleView, String> by fxid()
    private val beg: TableColumn<VehicleView, Date> by fxid()
    private val end: TableColumn<VehicleView, Date> by fxid()

    init {
        brand.cellValueFactory = PropertyValueFactory<VehicleView, String>("brand")
        model.cellValueFactory = PropertyValueFactory<VehicleView, String>("modelcar")
        licPlate.cellValueFactory = PropertyValueFactory<VehicleView, String>("licensePlate")
        fio.cellValueFactory = PropertyValueFactory<VehicleView, String>("fio")
        status.cellValueFactory = PropertyValueFactory<VehicleView, String>("status")
        beg.cellValueFactory = PropertyValueFactory<VehicleView, Date>("begDate")
        end.cellValueFactory = PropertyValueFactory<VehicleView, Date>("endDate")
        update()
    }

    fun update() {
        val data = vehicleTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(VEHICLE_VIEW)?.fetch()?.into(VehicleView::class.java)!!.asIterable())
    }

    fun addReg(){
        RegForm().openModal(block = true)
    }

    fun editReg(){
        if (regs.selectionModel.selectedItem == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = regs.selectionModel.selectedItem

        if (!Logic.lock(Lock.APPREG, temp.appregistrationPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        RegForm(temp).openModal(block = true)
    }
}


