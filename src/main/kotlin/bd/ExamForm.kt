package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import test.generated.Tables
import test.generated.tables.pojos.Person
import test.generated.tables.pojos.Category
import test.generated.tables.pojos.Examlist
import tornadofx.*

class ExamForm(ex: Examlist? = null) : View("My View") {
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

    }

    fun cancel() {
        currentStage!!.close()
    }
}
