package bd

import javafx.collections.ObservableList
import javafx.scene.control.TabPane
import javafx.scene.control.TableView
import javafx.scene.layout.GridPane
import test.generated.Tables.ASSIGNMENT
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.VehicleView
import test.generated.tables.records.AssignmentRecord
import tornadofx.View
import tornadofx.observable


class MainForm : View() {
    override val root: GridPane by fxml()
    private val vehicleTab: TableView<VehicleView> by fxml()

    init {
        EventBus.on(Events.LOGIN_DONE, {
            val result = Logic.inst?.create?.select()?.from(VEHICLE_VIEW)?.fetch()
            println(Logic.inst!!.create.select()?.from(VEHICLE_VIEW)?.fetch())
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


