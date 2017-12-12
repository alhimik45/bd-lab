package bd

import javafx.scene.control.TabPane
import tornadofx.*


class Chief : View() {
    override val root: TabPane by fxml()

    /*
    private val distribTable: TableView<Assignment> by fxid()

    private val name: TableColumn<Assignment, String> by fxid()
    private val ek: TableColumn<Assignment, String> by fxid()
    private val date: TableColumn<Assignment, String> by fxid()
    val data : ObservableList<Assignment> = mutableListOf<Assignment>().observable()

    init {
        name.setCellValueFactory(PropertyValueFactory<Assignment, String>("fio"))
        distribTable.items = data

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
    */
}
