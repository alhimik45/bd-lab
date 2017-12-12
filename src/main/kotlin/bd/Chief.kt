package bd

import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.PropertyValueFactory
import test.generated.Tables
import test.generated.tables.pojos.AllDistr
import test.generated.tables.pojos.VehicleView
import tornadofx.View
import java.util.*


class Chief : View("Начальника") {
    override val root: TabPane by fxml()


    private val distribTable: TableView<AllDistr> by fxid()

    private val fio: TableColumn<AllDistr, String> by fxid()
    private val date: TableColumn<AllDistr, Date> by fxid()
    private val num: TableColumn<AllDistr, String> by fxid()
    private val post: TableColumn<AllDistr, String> by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<AllDistr, String>("fio")
        date.cellValueFactory = PropertyValueFactory<AllDistr, Date>("dateorder")
        num.cellValueFactory = PropertyValueFactory<AllDistr, String>("personalid")
        post.cellValueFactory = PropertyValueFactory<AllDistr, String>("address")
        update()
    }

    private fun update() {
        val data = distribTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.ALL_DISTR)?.fetch()?.into(AllDistr::class.java)!!.asIterable())
    }
}
