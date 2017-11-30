package bd

import javafx.scene.layout.BorderPane
import tornadofx.*

class MyFXML : View("My View") {
    override val root: BorderPane by fxml()
}
