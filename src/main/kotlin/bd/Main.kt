package bd

import javafx.application.Application
import javafx.stage.Stage
import tornadofx.App
import test.generated.tables.Vehicle



class Main : App(MainForm::class) {

    override fun start(stage: Stage) {
        super.start(stage)
        LoginForm().openModal(block = true)
        if(Logic.inst == null){
            Helpers.alert("Данные не верны")
            System.exit(0)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Main::class.java)
        }
    }
}