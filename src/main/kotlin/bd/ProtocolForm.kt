package bd

import javafx.scene.layout.VBox
import test.generated.tables.pojos.Protocol
import tornadofx.*

class ProtocolForm(pe: Protocol?  = null) : View("Протокол") {
    override val root: VBox by fxml()

    fun cancel() {
        currentStage!!.close()
    }

    fun save() {

    }
}