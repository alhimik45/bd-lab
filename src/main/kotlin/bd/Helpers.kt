package bd

import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.layout.Region
import javafx.stage.Modality
import javafx.stage.Stage

import java.io.IOException

object Helpers {

    fun alert(message: String) {
        val alert = Alert(Alert.AlertType.ERROR, message)
        alert.dialogPane.minHeight = Region.USE_PREF_SIZE
        alert.showAndWait()
    }

    internal fun validationAlert(validation: List<String>): Boolean {
        if (validation.size != 0) {
            val alert = Alert(Alert.AlertType.ERROR, "Данные введены неверно:\n" + validation.joinToString("\n"))
            alert.dialogPane.prefHeight = 500.0
            alert.showAndWait()
            return true
        }
        return false
    }
}
