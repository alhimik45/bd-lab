package bd

import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Person
import tornadofx.View


class PersonForm(pe: Person? = null) : View("Физическое лицо") {
    override val root: VBox by fxml()

    val fio: TextField by fxid()
    val ser: TextField by fxid()
    val nom: TextField by fxid()
    val login: TextField by fxid()
    val address: TextField by fxid()
    val date: DatePicker by fxid()

    val p: Person = pe ?: Person()


    init {
        fio.text = p.fio ?: ""
        ser.text = p.pasportseries ?: ""
        nom.text = p.passportid ?: ""
        address.text = p.homeaddress ?: ""
        if (p.daybirth != null) {
            date.value = p.daybirth.toLocalDate()
        }
    }

    fun cancel() {
        if (p.personPk != null)
            Logic.unlock(Lock.PERSON, p.personPk)
        currentStage!!.close()
    }

    fun save() {
        try {
            p.fio = Logic.textCheckEmpty("ФИО", fio)
            p.pasportseries = Logic.textCheckReg("Серия паспорта", "\\d{4}", "4 цифры", ser)
            p.passportid = Logic.textCheckReg("Номер паспорта", "\\d{6}", "6 цифр", nom)
            p.homeaddress = Logic.textCheckEmpty("Адрес", address)
            p.daybirth = Logic.dateCheckEmpty("Дата рождения", date)

            if (p.personPk != null) {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
                    DSL.using(c).executeUpdate(pr)
                }
                Logic.create!!.execute("SELECT pg_advisory_unlock(${Lock.PERSON.ordinal},${p.personPk})")
            } else {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.PERSON, p)
                    pr.store()
                }
            }
            EventBus.emit(Events.FL_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}

