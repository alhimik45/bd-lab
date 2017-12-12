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
import test.generated.tables.pojos.Assignment
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


