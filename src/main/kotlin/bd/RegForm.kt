package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import sun.rmi.runtime.Log
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.*

class RegForm(val re: Appregistration? = null) : View("Заявление о регистрации") {
    override val root: VBox by fxml()
    private val peopleBox: ComboBox<String> by fxid()
    private val tsBox: ComboBox<String> by fxid()
    private val datePick: DatePicker by fxid()
    private var peopleList: MutableList<Person> = mutableListOf()
    private var aaa: MutableList<Pts> = Logic.create!!
            .select()
            .from(Tables.PTS)
            .fetch()
            .into(Pts::class.java)

    init {
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        peopleBox.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        tsBox.items.addAll(aaa
                .map { "${it.brand} ${it.modelcar}, ${it.vin}" })
        re?.let {
            peopleBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk1))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
            tsBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PTS)
                    .where(Tables.PTS.VEHICLE_PK.eq(it.vehiclePk))
                    .orderBy(Tables.PTS.DATE)
                    .fetch()[0]
                    .into(Pts::class.java)
                    .let { "${it.brand} ${it.modelcar}, ${it.vin}" })
            datePick.value = it.date.toLocalDate()
        }
        EventBus.on(Events.FL_UPD) {updPers()}
    }

    private fun updPers() {
        peopleBox.items.clear()
        peopleList.clear()
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        peopleBox.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        re?.let {
            peopleBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk1))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        }
    }

    fun openPers() {
        Persons().openModal(block = true)
    }

    fun save() {
        try {
            val rre = re ?: Appregistration()
            Logic.comboCheckEmpty("Владелец", peopleBox)
            Logic.comboCheckEmpty("Транспортное средство", tsBox)
            rre.personPk1 = peopleList[peopleBox.selectionModel.selectedIndex].personPk
            rre.date = Logic.dateCheckEmpty("Дата", datePick)
            rre.vehiclePk = aaa[tsBox.selectionModel.selectedIndex].vehiclePk
            rre.status = "Рассматривается"
            rre.personPk = Logic.user?.personPk
            rre.employePk = Logic.user?.employePk
            Logic.create!!.transaction { c ->
                val pr = DSL.using(c).newRecord(Tables.APPREGISTRATION, rre)
                if (rre.appregistrationPk != null) {
                    DSL.using(c).executeUpdate(pr)
                } else {
                    pr.store()
                }
            }
            re?.let {
                Logic.unlock(Lock.APPREG, it.appregistrationPk)
            }
            EventBus.emit(Events.AREG_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }

    fun cancel() {
        re?.let {
            Logic.unlock(Lock.APPREG, it.appregistrationPk)
        }
        currentStage!!.close()
    }
}
