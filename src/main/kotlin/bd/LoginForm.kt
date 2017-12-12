package bd

import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import tornadofx.Fragment

class LoginForm : Fragment() {
    override val root: GridPane by fxml()
    private val loginData: TextField by fxid()
    private val passwordData: TextField by fxid()
    init{
        title = "Вход на рабочее место"
    }

    fun login() {
        val login = loginData.textProperty().get()
        val password = passwordData.textProperty().get()
        Logic.create(login, password)
        currentStage!!.close()
    }
}