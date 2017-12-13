package bd

import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import test.generated.Tables
import test.generated.tables.pojos.Person
import tornadofx.View
import java.util.*


class Persons : View("Физические лица") {
    override val root: BorderPane by fxml()

    private val flTable: TableView<Person> by fxid()
    private val searchFl: TextField by fxid()

    private val fio: TableColumn<Person, String> by fxid()
    private val date: TableColumn<Person, Date> by fxid()
    private val nom: TableColumn<Person, String> by fxid()
    private val ser: TableColumn<Person, String> by fxid()
    private val address: TableColumn<Person, String> by fxid()

    init {
        fio.cellValueFactory = PropertyValueFactory<Person, String>("fio")
        date.cellValueFactory = PropertyValueFactory<Person, Date>("daybirth")
        nom.cellValueFactory = PropertyValueFactory<Person, String>("passportid")
        ser.cellValueFactory = PropertyValueFactory<Person, String>("pasportseries")
        address.cellValueFactory = PropertyValueFactory<Person, String>("homeaddress")
        update()
        EventBus.on(Events.FL_UPD) { update() }
        searchFl.textProperty().addListener { _, _, _ ->
            update()
        }
    }

    fun update() {
        val data = flTable.items
        data.clear()
        data.addAll(Logic.create!!.select()?.from(Tables.PERSON)?.fetch()?.into(Person::class.java)!!.filter { e ->
            val v = searchFl.text
            if (v == null || v.isEmpty()) {
                true
            } else {
                val lowerCaseFilter = v.toLowerCase().split(" ").filter { it.isNotBlank() }
                lowerCaseFilter.any { e.fio.toLowerCase().contains(it) } ||
                        lowerCaseFilter.any { e.pasportseries.toLowerCase().contains(it) } ||
                        lowerCaseFilter.any { e.passportid.toLowerCase().contains(it) }
            }
        })
    }

    fun neww() {
        PersonForm().openModal(block = true)
    }

    fun edit() {
        if (flTable.selectionModel.selectedItem == null) {
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val p = flTable.selectionModel.selectedItem
        val lock = Logic.lock(Lock.PERSON, p.personPk)
        if (!lock) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        PersonForm(p).openModal(block = true)
    }
}
