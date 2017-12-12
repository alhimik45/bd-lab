package bd

import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.VehicleView
import tornadofx.View
import java.util.*


class EmployeeCars : View() {
    override val root: BorderPane by fxml()
    private val vehicleTable: TableView<VehicleView> by fxid()
    private val licPlate: TableColumn<VehicleView, String> by fxid()
    private val model: TableColumn<VehicleView, String> by fxid()
    private val brand: TableColumn<VehicleView, String> by fxid()
    private val fio: TableColumn<VehicleView, String> by fxid()
    private val status: TableColumn<VehicleView, String> by fxid()
    private val beg: TableColumn<VehicleView, Date> by fxid()
    private val end: TableColumn<VehicleView, Date> by fxid()


    fun update() {
        val data = vehicleTable.items
        Logic.create!!.select()?.from(VEHICLE_VIEW)?.fetch()?.forEach { item ->
            data.add(VehicleView(item[VEHICLE_VIEW.LICENSE_PLATE], item[VEHICLE_VIEW.MODELCAR],
                    item[VEHICLE_VIEW.BRAND], item[VEHICLE_VIEW.FIO],
                    item[VEHICLE_VIEW.STATUS], item[VEHICLE_VIEW.BEG_DATE],
                    item[VEHICLE_VIEW.END_DATE]))
        }
    }


    init {
        brand.setCellValueFactory(PropertyValueFactory<VehicleView, String>("brand"))
        model.setCellValueFactory(PropertyValueFactory<VehicleView, String>("modelcar"))
        licPlate.setCellValueFactory(PropertyValueFactory<VehicleView, String>("licensePlate"))
        fio.setCellValueFactory(PropertyValueFactory<VehicleView, String>("fio"))
        status.setCellValueFactory(PropertyValueFactory<VehicleView, String>("status"))
        beg.setCellValueFactory(PropertyValueFactory<VehicleView, Date>("begDate"))
        end.setCellValueFactory( PropertyValueFactory<VehicleView, Date>("endDate"))
        EventBus.on(Events.LOGIN_DONE, {
            update()
        })
    }
}


