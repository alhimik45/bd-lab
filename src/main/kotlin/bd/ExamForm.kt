package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Category
import test.generated.tables.pojos.Examlist
import test.generated.tables.pojos.Position
import tornadofx.*

class ExamForm(val ex: Examlist? = null) : View("My View") {
    override val root: VBox by fxml()
    private val peopleBox: ComboBox<String> by fxid()
    private val catBox: ComboBox<String> by fxid()
    private val statusBox: ComboBox<String> by fxid()
    private val datePick: DatePicker by fxid()

    init {
        statusBox.items.addAll(listOf("Сдано", "Не сдано"))
        peopleBox.items.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java)
                .map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        catBox.items.addAll(Logic.create!!
                .select()
                .from(Tables.CATEGORY)
                .fetch()
                .into(Category::class.java)
                .map { it.name })
        ex?.let {
            peopleBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(ex.personPk))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
            val splited = ex.results.split(" - ")
            catBox.selectionModel.select(splited[0])
            statusBox.selectionModel.select(splited[1])
            datePick.value = ex.date.toLocalDate()
        }
    }


    fun save() {
        try {
//            e
//            p.fio = tex("ФИО", fio)
//            p.pasportseries = rege("Серия паспорта", "\\d{4}", "4 цифры", ser)
//            p.passportid = rege("Номер паспорта", "\\d{6}", "6 цифр", nom)
//            e.personalid = tex("Личный номер", num)
//            p.homeaddress = tex("Адрес", address)
//            e.login = tex("Логин", login)
//            e.password = pass.text ?: ""
//            p.daybirth = dat("Дата рождения", date)
//            val ppos = comb("Должность", pos)
//            e.positionPk = Logic.create!!.select().from(Tables.POSITION).where(Tables.POSITION.NAME.eq(ppos)).fetchOne().into(Position::class.java).positionPk
//
//            if (p.personPk != null) {
//                Logic.create!!.transaction { c ->
//                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
//                    DSL.using(c).executeUpdate(pr)
//                    val er = DSL.using(c).newRecord(Tables.EMPLOYE, e)
//                    DSL.using(c).executeUpdate(er)
//                }
//                Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.PERSON.ordinal},${p.personPk})")
//                Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.EMP.ordinal},${e.employePk})")
//            } else {
//                Logic.create!!.transaction { c ->
//                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
//                    pr.store()
//                    e.personPk = pr.personPk
//                    val er = DSL.using(c).newRecord(Tables.EMPLOYE, e)
//                    er.store()
//                }
//            }
            EventBus.emit(Events.EXAM_UPD)
            ex?.let {
                Logic.unlock(Lock.EXAMLIST, ex.examlistPk)
                Logic.unlock(Lock.PERSON, ex.personPk)
            }
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }

    fun cancel() {
        ex?.let {
            Logic.unlock(Lock.EXAMLIST, ex.examlistPk)
            Logic.unlock(Lock.PERSON, ex.personPk)
        }
        currentStage!!.close()
    }
}
