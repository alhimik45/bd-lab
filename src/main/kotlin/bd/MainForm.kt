package bd

import javafx.scene.control.TableView
import javafx.scene.layout.GridPane
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.VehicleView
import tornadofx.View


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