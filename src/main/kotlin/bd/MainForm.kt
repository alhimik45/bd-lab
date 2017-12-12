package bd

import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import test.generated.tables.VehicleView
import tornadofx.View
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.DSLContext
import test.generated.tables.Vehicle
import java.sql.DriverManager
import test.generated.Tables.*


class MainForm : View() {
    override val root: GridPane by fxml()
    private val vehicleTab: TableView<VehicleView> by fxml()

    init {
        val result = Logic.inst?.create?.select()?.from(VEHICLE_VIEW)?.fetch()
        println(Logic.inst!!.create.select()?.from(VEHICLE_VIEW)?.fetch())
    }
}