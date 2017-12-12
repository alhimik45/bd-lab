package bd

import javafx.collections.ObservableList
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.GridPane
import test.generated.Tables.ASSIGNMENT
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.VehicleView
import test.generated.tables.records.AssignmentRecord
import test.generated.tables.records.VehicleViewRecord
import tornadofx.View
import tornadofx.observable


class MainForm : View() {
    override val root: GridPane by fxml()
    private val vehicleTab: TableView<VehicleViewRecord> by fxid()
    private val brand: TableColumn<VehicleViewRecord, String> by fxid()
    private val model: TableColumn<VehicleViewRecord, String> by fxid()
    private val licPlate: TableColumn<VehicleViewRecord, String> by fxid()
    private val fio: TableColumn<VehicleViewRecord, String> by fxid()
    private val status: TableColumn<VehicleViewRecord, String> by fxid()
    private val beg: TableColumn<VehicleViewRecord, String> by fxid()
    private val end: TableColumn<VehicleViewRecord, String> by fxid()



    init {
        EventBus.on(Events.LOGIN_DONE, {
            val result = Logic.inst?.create?.select()?.from(VEHICLE_VIEW)?.fetch()
            println(Logic.inst!!.create.select()?.from(VEHICLE_VIEW)?.fetch())
            brand.setCellValueFactory( PropertyValueFactory<>())
            fioCol.setCellValueFactory(new PropertyValueFactory<>("fio"));
            phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));
            val data = vehicleTab.items
            Logic.inst!!.create.select()?.from(VEHICLE_VIEW)?.fetch()?.forEach { item ->
                data.add(VehicleViewRecord(item[VEHICLE_VIEW.BRAND], item[VEHICLE_VIEW.MODELCAR],
                        item[VEHICLE_VIEW.LICENSE_PLATE], item[VEHICLE_VIEW.FIO],
                        item[VEHICLE_VIEW.STATUS], item[VEHICLE_VIEW.BEG_DATE],
                        item[VEHICLE_VIEW.END_DATE]))
            }
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


