package bd

import javafx.application.Application
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.stage.Stage
import tornadofx.*
import java.awt.Panel
import javafx.fxml.FXMLLoader
import javafx.scene.layout.BorderPane
import javafx.scene.control.Label
import javafx.scene.control.TabPane


class Main : App(MainForm::class) {

    override fun start(stage: Stage) {
        super.start(stage)
        LoginForm().openModal(block = true)
        if(Logic.inst == null){

            Helpers.alert("Данные не верны")
            System.exit(0)
        }
    }

}


class Protocols : View() {
    override val root: TabPane by fxml()

  //  private val nameInTop: TextField by fxid()


}


class Run: App(Protocols::class){
    override fun start(stage: Stage) {
        super.start(stage)
    }

}


fun main(args: Array<String>) {
    Application.launch(Run::class.java)
}
