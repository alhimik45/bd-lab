package bd

import javafx.application.Application
import javafx.scene.control.TabPane
import javafx.stage.Stage
import tornadofx.App
import tornadofx.View


class Main : App(MainForm::class) {

    override fun start(stage: Stage) {
        super.start(stage)
        LoginForm().openModal(block = true)
        if(Logic.inst == null){

            Helpers.alert("Данные не верны")
            System.exit(0)
        }
        EventBus.emit(Events.LOGIN_DONE)
    }

}


class Chief : View() {
    override val root: TabPane by fxml()

  //  private val nameInTop: TextField by fxid()


}


class Run: App(Chief::class){
    override fun start(stage: Stage) {
        super.start(stage)
    }

}


fun main(args: Array<String>) {
    Application.launch(Run::class.java)
}
