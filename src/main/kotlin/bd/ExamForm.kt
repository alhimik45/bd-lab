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

class ExamForm(val ex: Examlist? = null) : View("Экзаменационные ведомости") {
    override val root: VBox by fxml()
    private val peopleBox: ComboBox<String> by fxid()
    private val catBox: ComboBox<String> by fxid()
    private val statusBox: ComboBox<String> by fxid()
    private val datePick: DatePicker by fxid()
    private var peopleList: MutableList<Person> = mutableListOf()

    init {
        statusBox.items.addAll(listOf("Сдано", "Не сдано"))
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        peopleBox.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
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
                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
            val splited = it.results.split(" - ")
            catBox.selectionModel.select(splited[0])
            statusBox.selectionModel.select(splited[1])
            datePick.value = it.date.toLocalDate()
        }
        EventBus.on(Events.FL_UPD) {updPers()}
    }

    private fun updPers() {
        peopleBox.items.clear()
        peopleBox.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        ex?.let {
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
            val e: Examlist = ex ?: Examlist()
            Logic.comboCheckEmpty("ФИО", peopleBox)
            Logic.comboCheckEmpty("категория", catBox)
            Logic.comboCheckEmpty("статус", statusBox)
            e.personPk = peopleList[peopleBox.selectionModel.selectedIndex].personPk
            e.results = "${catBox.selectionModel.selectedItem} - ${statusBox.selectionModel.selectedItem}"
            e.date = Logic.dateCheckEmpty("дата", datePick)

            Logic.create!!.transaction { c ->
                if (e.examlistPk != null) {
                    val pr = DSL.using(c).newRecord(Tables.EXAMLIST, e)
                    DSL.using(c).executeUpdate(pr)
                } else {
                    val pr = DSL.using(c).newRecord(Tables.EXAMLIST, e)
                    pr.store()
                }
            }
            ex?.let {
                Logic.unlock(Lock.EXAMLIST, ex.examlistPk)
                Logic.unlock(Lock.PERSON, ex.personPk)
            }
            EventBus.emit(Events.EXAM_UPD)
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
