package bd

import javafx.collections.transformation.FilteredList
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import test.generated.Tables
import test.generated.tables.pojos.Protocol
import test.generated.tables.pojos.ProtocolView
import tornadofx.*
import java.util.*

class Inspector : View("Инспектор ДПС") {
    override val root: BorderPane by fxml()

    private val protocolsTable: TableView<ProtocolView> by fxid()
    private val searchProtocol: TextField by fxid()
    private var dataPr = protocolsTable.items
    private var searchPr = FilteredList<ProtocolView>(dataPr){ _ -> true}

    private val fioczel: TableColumn<ProtocolView, String> by fxid()
    private val type: TableColumn<ProtocolView, String> by fxid()
    private val ser: TableColumn<ProtocolView, String> by fxid()
    private val nom: TableColumn<ProtocolView, String> by fxid()
    private val stat: TableColumn<ProtocolView, String> by fxid()
    private val addressnar: TableColumn<ProtocolView, String> by fxid()
    private val date: TableColumn<ProtocolView, Date> by fxid()


    init {
        fioczel.cellValueFactory = PropertyValueFactory<ProtocolView, String>("fio")
        ser.cellValueFactory = PropertyValueFactory<ProtocolView, String>("pasportseries")
        nom.cellValueFactory = PropertyValueFactory<ProtocolView, String>("passportid")
        date.cellValueFactory = PropertyValueFactory<ProtocolView, Date>("date")
        type.cellValueFactory = PropertyValueFactory<ProtocolView, String>("name")
        stat.cellValueFactory = PropertyValueFactory<ProtocolView, String>("articlecop")
        addressnar.cellValueFactory = PropertyValueFactory<ProtocolView, String>("addressvioalation")
        protocolsTable.columnResizePolicy = SmartResize.POLICY
        updateProtocols()
        searchProtocol.textProperty().addListener { _, _, newValue ->
            searchPr.setPredicate { item ->
                if (newValue == null || newValue.isEmpty()) {
                    true
                } else {
                    var flag = true
                    newValue.toLowerCase().split(" ").forEach {
                        if (!(item.fio.toLowerCase().contains(it) ||
                                item.pasportseries.toLowerCase().contains(it) ||
                                item.passportid.toLowerCase().contains(it) ||
                                item.name.toLowerCase().contains(it) ||
                                item.articlecop.toLowerCase().contains(it)))
                            flag = false
                    }
                    flag
                }
            }
        }
        EventBus.on(Events.PRTC_UPD) { updateProtocols() }
    }

    fun updateProtocols() {
        dataPr.clear()
        dataPr.addAll(Logic.create!!
                .select()
                .from(Tables.PROTOCOL_VIEW)
                .fetch()
                .into(ProtocolView::class.java)!!
                .asIterable())
        searchPr = FilteredList<ProtocolView>(dataPr){ _ -> true}
        protocolsTable.items = searchPr
    }

    fun newProtocol() {
        ProtocolForm().openModal(block = true)
    }

    fun modProtocol() {
        if (protocolsTable.selectionModel.selectedItem == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = protocolsTable.selectionModel.selectedItem
        val l = Logic.create!!
                .select()
                .from(Tables.PROTOCOL)
                .where(Tables.PROTOCOL.PROTOCOL_PK.eq(temp.protocolPk))
                .fetchOne()
                .into(Protocol::class.java)
        if (!Logic.lock(Lock.PRTC, temp.protocolPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        if (!Logic.lock(Lock.PERSON, temp.personPk)) {
            Logic.unlock(Lock.PRTC, temp.protocolPk)
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        ProtocolForm(l).openModal(block = true)
    }

}
