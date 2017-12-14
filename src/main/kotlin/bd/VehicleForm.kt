package bd

import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Protocol
import test.generated.tables.pojos.Protocoltype
import test.generated.tables.pojos.Vehicle
import tornadofx.*

class VehicleForm(val ve: Vehicle? = null) : View("Транспортное средство") {
    override val root: VBox by fxml()

    private fun updPers() {
//        fio.items.clear()
//        fio.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
//        ve?.let {
//            fio.selectionModel.select(Logic.create!!
//                    .select()
//                    .from(Tables.PERSON)
//                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk1))
//                    .fetchOne()
//                    .into(Person::class.java)
//                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
//        }
    }

    fun openPers() {
        Persons().openModal(block = true)
    }

    fun cancel() {
//        pe?.let {
//            Logic.unlock(Lock.PRTC, it.protocolPk)
//            Logic.unlock(Lock.PERSON, it.personPk)
//        }
//        currentStage!!.close()
    }

    fun save() {
        try {
//            val e: Protocol = pe ?: Protocol()
//            Logic.comboCheckEmpty("лицо", fio)
//            e.personPk = peopleList[fio.selectionModel.selectedIndex].personPk
//            e.addressvioalation = Logic.textCheckEmpty("адрес нарушения", addressnar)
//            e.date = Logic.dateCheckEmpty("дата нарушения", date)
//            e.articlecop = Logic.textCheckEmpty("статья КОАП", stat)
//            e.more = pod.text
//            Logic.comboCheckEmpty("тип протокола", protocolType)
//            e.protocoltypePk = Logic.create!!
//                    .select()
//                    .from(Tables.PROTOCOLTYPE)
//                    .where(Tables.PROTOCOLTYPE.NAME.eq(protocolType.selectedItem))
//                    .fetchOne()
//                    .into(Protocoltype::class.java)
//                    .protocoltypePk
//
//            Logic.create!!.transaction { c ->
//                if (e.protocolPk != null) {
//                    val pr = DSL.using(c).newRecord(Tables.PROTOCOL, e)
//                    DSL.using(c).executeUpdate(pr)
//                } else {
//                    e.employePk = Logic.user?.employePk
//                    e.personPk1 = Logic.user?.personPk
//                    val pr = DSL.using(c).newRecord(Tables.PROTOCOL, e)
//                    pr.store()
//                }
//            }
//            pe?.let {
//                Logic.unlock(Lock.PRTC, it.protocolPk)
//                Logic.unlock(Lock.PERSON, it.personPk)
//            }
//            EventBus.emit(Events.PRTC_UPD)
//            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}
