package bd

import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import tornadofx.View

class MainForm : View() {
    override val root: GridPane by fxml()
    private val loginData: TextField by fxml()
    private val passwordData: TextField by fxml()

    fun login() {
        currentStage!!.close()
        val login = loginData.textProperty().get()
        val password = passwordData.textProperty().get()
        Logic.create(login, password)
    }
}