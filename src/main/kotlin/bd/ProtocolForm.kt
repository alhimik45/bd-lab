package bd

import javafx.scene.layout.VBox
import test.generated.tables.pojos.Protocol
import tornadofx.*

class ProtocolForm(val pe: Protocol?  = null) : View("Протокол") {
    override val root: VBox by fxml()

    fun cancel() {
        pe?.let {
            Logic.unlock(Lock.PRTC, it.protocolPk)
            Logic.unlock(Lock.PERSON, it.personPk)
        }
        currentStage!!.close()
    }

    fun save() {
        try {
            val e: Protocol = pe ?: Protocol()
//            Logic.comboCheckEmpty("ФИО", peopleBox)
//            Logic.comboCheckEmpty("категория", catBox)
//            Logic.comboCheckEmpty("статус", statusBox)
//            e.personPk = peopleList[peopleBox.selectionModel.selectedIndex].personPk
//            e.results = "${catBox.selectionModel.selectedItem} - ${statusBox.selectionModel.selectedItem}"
//            e.date = Logic.dateCheckEmpty("дата", datePick)
//
//            Logic.create!!.transaction { c ->
//                if (e.examlistPk != null) {
//                    val pr = DSL.using(c).newRecord(Tables.EXAMLIST, e)
//                    DSL.using(c).executeUpdate(pr)
//                } else {
//                    val pr = DSL.using(c).newRecord(Tables.EXAMLIST, e)
//                    pr.store()
//                }
//            }
            pe?.let {
                Logic.unlock(Lock.PRTC, it.protocolPk)
                Logic.unlock(Lock.PERSON, it.personPk)
            }
            EventBus.emit(Events.EXAM_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}