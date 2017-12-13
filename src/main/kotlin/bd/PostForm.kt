package bd

import javafx.scene.control.CheckBox
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Employe
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Position
import test.generated.tables.pojos.Postdps
import tornadofx.View
import java.sql.Date


class PostForm(p:Postdps?  = null) : View("Пост ДПС") {
    override val root: VBox by fxml()

    val address: TextField by fxid()
    val active: CheckBox by fxid()

    val p: Postdps = p ?: Postdps()


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
        currentStage!!.close()
    }

    fun tex(name: String, t: TextField): String {
        if (t.text.isNullOrBlank()) {
            Helpers.alert("$name не может быть пустым")
            throw KekException()
        }
        return t.text!!
    }

    fun rege(name: String, pattern: String, cause: String, t: TextField): String {
        if (!t.text.matches(Regex(pattern))) {
            Helpers.alert("$name должно быть $cause")
            throw KekException()
        }
        return t.text!!
    }

    fun dat(name: String, t: DatePicker): Date {
        if (t.value == null) {
            Helpers.alert("$name должно быть заполнено")
            throw KekException()
        }
        return Date.valueOf(t.value)
    }

    fun <T> comb(name: String, t: ComboBox<T>): T {
        if (t.selectionModel.selectedItem == null) {
            Helpers.alert("$name должно быть выбрано")
            throw KekException()
        }
        return t.selectionModel.selectedItem;
    }

    fun save() {
        try {
            p.fio = tex("ФИО", fio)
            p.pasportseries = rege("Серия паспорта", "\\d{4}", "4 цифры", ser)
            p.passportid = rege("Номер паспорта", "\\d{6}", "6 цифр", nom)
            e.personalid = tex("Личный номер", num)
            p.homeaddress = tex("Адрес", address)
            e.login = tex("Логин", login)
            e.password = pass.text ?: ""
            p.daybirth = dat("Дата рождения", date)
            val ppos = comb("Должность", pos)
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

