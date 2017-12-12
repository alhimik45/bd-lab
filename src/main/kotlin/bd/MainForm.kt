package bd

import javafx.collections.ObservableList
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.GridPane
import test.generated.Tables.ASSIGNMENT
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.records.AssignmentRecord
import test.generated.tables.pojos.VehicleView
import tornadofx.View
import tornadofx.observable
import java.util.*


class MainForm : View() {
    override val root: GridPane by fxml()
    private val vehicleTab: TableView<VehicleView> by fxid()
    private val licPlate: TableColumn<VehicleView, String> by fxid()
    private val model: TableColumn<VehicleView, String> by fxid()
    private val brand: TableColumn<VehicleView, String> by fxid()
    private val fio: TableColumn<VehicleView, String> by fxid()
    private val status: TableColumn<VehicleView, String> by fxid()
    private val beg: TableColumn<VehicleView, Date> by fxid()
    private val end: TableColumn<VehicleView, Date> by fxid()


    fun updateVehicleTable() {
        val data = vehicleTab.items
        Logic.inst!!.create.select()?.from(VEHICLE_VIEW)?.fetch()?.forEach { item ->
            data.add(VehicleView(item[VEHICLE_VIEW.LICENSE_PLATE], item[VEHICLE_VIEW.MODELCAR],
                    item[VEHICLE_VIEW.BRAND], item[VEHICLE_VIEW.FIO],
                    item[VEHICLE_VIEW.STATUS], item[VEHICLE_VIEW.BEG_DATE],
                    item[VEHICLE_VIEW.END_DATE]))
        }
    }


    init {
        EventBus.on(Events.LOGIN_DONE, {
            brand.setCellValueFactory( PropertyValueFactory<VehicleView, String>("brand"))
            model.setCellValueFactory( PropertyValueFactory<VehicleView, String>("modelcar"))
            licPlate.setCellValueFactory( PropertyValueFactory<VehicleView, String>("licensePlate"))
            fio.setCellValueFactory( PropertyValueFactory<VehicleView, String>("fio"))
            status.setCellValueFactory( PropertyValueFactory<VehicleView, String>("status"))
            beg.setCellValueFactory( PropertyValueFactory<VehicleView, Date>("begDate"))
            end.setCellValueFactory( PropertyValueFactory<VehicleView, Date>("endDate"))
            updateVehicleTable()
        })

    }
}


class Chief : View() {
    override val root: TabPane by fxml()

    private val table: TableView<AssignmentRecord> by fxid()
    val data : ObservableList<AssignmentRecord> = mutableListOf<AssignmentRecord>().observable()

    init {
        table.items = data
        EventBus.on(Events.LOGIN_DONE, {
            update()
        })

    }

    private fun update(){
        data.clear()
        Logic.inst!!.create.select()?.from(ASSIGNMENT)?.fetch()?.forEach {
            data.add(it.into(ASSIGNMENT))
        }
    }
}


