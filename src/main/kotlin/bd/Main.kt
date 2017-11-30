package bd

import javafx.application.Application







class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Application.launch(MyApp::class.java, *args)
        }
    }
}