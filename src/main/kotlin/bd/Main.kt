package bd

import javafx.application.Application
import tornadofx.App


class Main : App(LoginForm::class) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(Main::class.java)
        }
    }
}
