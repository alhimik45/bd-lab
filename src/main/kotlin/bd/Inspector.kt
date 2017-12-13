package bd

import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.*
import java.util.*

class Inspector : View("Инспектор ДПС") {
    override val root: BorderPane by fxml()
/*
    private val protocolsTable: TableView<Protocol> by fxid()
    private val searchProtocol: TextField by fxid()

    private val fioczel: TableColumn<Protocol, String> by fxid()
    private val ser: TableColumn<Protocol, String> by fxid()
    private val nom: TableColumn<Protocol, Date> by fxid()
    private val date: TableColumn<Protocol, String> by fxid()
    private val address: TableColumn<Protocol, String> by fxid()
    private val stat: TableColumn<Protocol, String> by fxid()
    private val addressnar: TableColumn<Protocol, String> by fxid()


    init {
        fioczel.cellValueFactory = PropertyValueFactory<Protocol, String>("fioczel")
        ser.cellValueFactory = PropertyValueFactory<Protocol, String>("ser")
        nom.cellValueFactory = PropertyValueFactory<Protocol, Date>("nom")
        date.cellValueFactory = PropertyValueFactory<Protocol, String>("date")
        address.cellValueFactory = PropertyValueFactory<Protocol, String>("address")
        stat.cellValueFactory = PropertyValueFactory<Protocol, String>("stat")
        addressnar.cellValueFactory = PropertyValueFactory<Protocol, String>("addressnar")

        val data = protocolsTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.PROTOCOL)?.fetch()?.into(Protocol::class.java)!!.asIterable())

    }
*/

    fun newProtocol() {
        ProtocolForm().openModal(block = true)
    }


}
