package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Protocol
import test.generated.tables.pojos.Protocoltype
import tornadofx.*

class ProtocolForm(val pe: Protocol?  = null) : View("Протокол") {
    override val root: VBox by fxml()

    private val fio: ComboBox<String> by fxid()
    private val protocolType: ComboBox<String> by fxid()
    private val pod: TextArea by fxid()


    private val stat: TextField by fxid()
    private val date: DatePicker by fxid()
    private val addressnar: TextField by fxid()

    private val peopleList = mutableListOf<Person>()

    init {
        protocolType.items.addAll(Logic.create!!
                .select()
                .from(Tables.PROTOCOLTYPE)
                .fetch()
                .into(Protocoltype::class.java)
                .map { it.name })
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        fio.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })

        pe?.let {
            fio.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
            protocolType.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PROTOCOLTYPE)
                    .where(Tables.PROTOCOLTYPE.PROTOCOLTYPE_PK.eq(it.protocoltypePk))
                    .fetchOne()
                    .into(Protocoltype::class.java)
                    .name)
            pod.text = it.more
            date.value = it.date.toLocalDate()
            stat.text = it.articlecop
            addressnar.text = it.addressvioalation
        }
    }

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
            Logic.comboCheckEmpty("лицо", fio)
            e.personPk = peopleList[fio.selectionModel.selectedIndex].personPk
            e.addressvioalation = Logic.textCheckEmpty("адрес нарушения", addressnar)
            e.date = Logic.dateCheckEmpty("дата нарушения", date)
            e.articlecop = Logic.textCheckEmpty("статья КОАП", stat)
            e.more = pod.text
            Logic.comboCheckEmpty("тип протокола", protocolType)
            e.protocoltypePk = Logic.create!!
                    .select()
                    .from(Tables.PROTOCOLTYPE)
                    .where(Tables.PROTOCOLTYPE.NAME.eq(protocolType.selectedItem))
                    .fetchOne()
                    .into(Protocoltype::class.java)
                    .protocoltypePk

            Logic.create!!.transaction { c ->
                if (e.protocolPk != null) {
                    val pr = DSL.using(c).newRecord(Tables.PROTOCOL, e)
                    DSL.using(c).executeUpdate(pr)
                } else {
                    e.employePk = Logic.user?.employePk
                    e.personPk1 = Logic.user?.personPk
                    val pr = DSL.using(c).newRecord(Tables.PROTOCOL, e)
                    pr.store()
                }
            }
            pe?.let {
                Logic.unlock(Lock.PRTC, it.protocolPk)
                Logic.unlock(Lock.PERSON, it.personPk)
            }
            EventBus.emit(Events.PRTC_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}