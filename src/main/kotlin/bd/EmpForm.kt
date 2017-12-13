package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Employe
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Position
import tornadofx.View


class EmpForm(pe: Person? = null, ee: Employe? = null) : View("Сотрудник") {
    override val root: VBox by fxml()

    val fio: TextField by fxid()
    val ser: TextField by fxid()
    val num: TextField by fxid()
    val nom: TextField by fxid()
    val login: TextField by fxid()
    val pass: TextField by fxid()
    val address: TextField by fxid()
    val date: DatePicker by fxid()
    val pos: ComboBox<String> by fxid()

    val p: Person = pe ?: Person()
    val e: Employe = ee ?: Employe()


    init {
        fio.text = p.fio ?: ""
        ser.text = p.pasportseries ?: ""
        num.text = e.personalid ?: ""
        nom.text = p.passportid ?: ""
        address.text = p.homeaddress ?: ""
        login.text = e.login ?: ""
        if (p.daybirth != null) {
            date.value = p.daybirth.toLocalDate()
        }
        updatePos()
        if (e.positionPk != null) {
            pos.selectionModel.select(Logic.create!!.select().from(Tables.POSITION).where(Tables.POSITION.POSITION_PK.eq(e.positionPk)).fetchOne().into(Position::class.java).name)
        }
    }

    fun updatePos() {
        pos.items.clear()
        pos.items.addAll(Logic.create!!.select().from(Tables.POSITION).fetch().into(Position::class.java).map { it.name })
    }

    fun cancel() {
        if (p.personPk != null)
            Logic.unlock(Lock.PERSON, p.personPk)
        if (e.employePk != null)
            Logic.unlock(Lock.EMP, e.employePk)
        currentStage!!.close()
    }

    fun save() {
        try {
            p.fio = Logic.textCheckEmpty("ФИО", fio)
            p.pasportseries = Logic.textCheckReg("Серия паспорта", "\\d{4}", "4 цифры", ser)
            p.passportid = Logic.textCheckReg("Номер паспорта", "\\d{6}", "6 цифр", nom)
            e.personalid = Logic.textCheckEmpty("Личный номер", num)
            p.homeaddress = Logic.textCheckEmpty("Адрес", address)
            e.login = Logic.textCheckEmpty("Логин", login)
            e.password = pass.text ?: ""
            p.daybirth = Logic.dateCheckEmpty("Дата рождения", date)
            val ppos = Logic.comboCheckEmpty("Должность", pos)
            e.positionPk = Logic.create!!.select().from(Tables.POSITION).where(Tables.POSITION.NAME.eq(ppos)).fetchOne().into(Position::class.java).positionPk

            if (p.personPk != null) {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
                    DSL.using(c).executeUpdate(pr)
                    val er = DSL.using(c).newRecord(Tables.EMPLOYE, e)
                    DSL.using(c).executeUpdate(er)
                }
                Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.PERSON.ordinal},${p.personPk})")
                Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.EMP.ordinal},${e.employePk})")
            } else {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
                    pr.store()
                    e.personPk = pr.personPk
                    val er = DSL.using(c).newRecord(Tables.EMPLOYE, e)
                    er.store()
                }
            }
            EventBus.emit(Events.EMP_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}

