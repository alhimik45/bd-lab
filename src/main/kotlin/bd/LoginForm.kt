package bd

import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.input.KeyCode
import javafx.scene.layout.GridPane
import test.generated.Tables.EMPLOYE_VIEW
import tornadofx.Fragment

class LoginForm : Fragment("Вход на рабочее место") {
    override val root: GridPane by fxml()
    private val loginData: TextField by fxid()
    private val passwordData: TextField by fxid()
    private val loginBtn: Button by fxid()

    init {
//        loginBtn.onKeyPressed = EventHandler { event ->
//            if (event.code == KeyCode.ENTER) {
//                login()
//            }
//        }
//        passwordData.onKeyPressed = EventHandler { event ->
//            if (event.code == KeyCode.ENTER) {
//                login()
//            }
//        }
    }


    fun login() {
        val login = loginData.textProperty().get()
        val password = passwordData.textProperty().get()
        Logic.create(login, password)
        if (Logic.create == null) {
            Helpers.alert("Данные не верны")
            System.exit(0)
        }
        currentStage!!.hide()
        when (Logic.user!!.positionPk!!) {
            1L -> {
                Chief().openModal(block = true)
            }
            2L -> {
                Inspector().openModal(block = true)
            }
            3L -> {
                EmployeeLicenses().openModal(block = true)
            }
            4L -> {
                EmployeeCars().openModal(block = true)
            }
        }

    }
}