package bd

import javafx.collections.ObservableList
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.GridPane
import test.generated.Tables.ASSIGNMENT
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.VehicleView
import tornadofx.View
import tornadofx.observable
import java.util.*
import test.generated.tables.pojos.Assignment


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
        brand.setCellValueFactory(PropertyValueFactory<VehicleView, String>("brand"))
        model.setCellValueFactory(PropertyValueFactory<VehicleView, String>("modelcar"))
        licPlate.setCellValueFactory(PropertyValueFactory<VehicleView, String>("licensePlate"))
        fio.setCellValueFactory(PropertyValueFactory<VehicleView, String>("fio"))
        status.setCellValueFactory(PropertyValueFactory<VehicleView, String>("status"))
        beg.setCellValueFactory(PropertyValueFactory<VehicleView, Date>("begDate"))
        end.setCellValueFactory( PropertyValueFactory<VehicleView, Date>("endDate"))
        EventBus.on(Events.LOGIN_DONE, {
            updateVehicleTable()
        })
    }
}


class Chief : View() {
    override val root: TabPane by fxml()

    private val table: TableView<Assignment> by fxid()
    private val name: TableColumn<Assignment, String> by fxid()
    private val ek: TableColumn<Assignment, String> by fxid()
    private val date: TableColumn<Assignment, String> by fxid()
    val data : ObservableList<Assignment> = mutableListOf<Assignment>().observable()

    init {
        name.setCellValueFactory(PropertyValueFactory<Assignment, String>("fio"))
        table.items = data

        EventBus.on(Events.LOGIN_DONE, {
            update()
        })

    }

    private fun update(){
        data.clear()
        Logic.inst!!.create.select()?.from(ASSIGNMENT)?.fetch()?.forEach {
            data.add(it.into(Assignment::class.java))
        }
    }
}


