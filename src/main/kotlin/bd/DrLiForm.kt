package bd

import javafx.scene.control.*
import javafx.scene.control.cell.CheckBoxListCell
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.Category
import test.generated.tables.pojos.Driverlicense
import test.generated.tables.pojos.Drcateg
import test.generated.tables.pojos.Person

import tornadofx.*

class DrLiForm(var drLi: Driverlicense? = null) : View("Водительские права") {
    override val root: VBox by fxml()

    private val persBox: ComboBox<String> by fxid()
    private val num: TextField by fxid()
    private val date: DatePicker by fxid()
    private val catView: ListView<CheckItem<String>> by fxid()
    private var peopleList: MutableList<Person> = mutableListOf()
    private var catList: MutableList<Category> = mutableListOf()
    private val drcList: MutableList<Drcateg> = mutableListOf()

    init {
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        persBox.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        catList.addAll(Logic.create!!
                .select()
                .from(Tables.CATEGORY)
                .fetch()
                .into(Category::class.java))
        catList.forEach { catView.items.add(CheckItem(it.name, false)) }
        catView.cellFactory = CheckBoxListCell.forListView {item -> item.checked }
        println(drLi)
        drLi?.let {
            persBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(it.personPk1))
                    .fetchOne()
                    .into(Person::class.java)
                    .let { "${it.fio} ${it.pasportseries} ${it.passportid}" })
            num.text = it.licenseid
            catList.forEach { item ->
                val a = Logic.create!!
                        .select()
                        .from(Tables.DRCATEG)
                        .where(Tables.DRCATEG.DRIVERLICENSE_PK
                                .eq(it.driverlicensePk)
                                .and(Tables.DRCATEG.CATEGORY_PK.eq(item.categoryPk)))
                        .fetchOne()
                if (a != null) {
                    catView.items[catView.items.map {it.o}.indexOf(item.name)]
                            .checked.set(true)
                }
            }
            date.value = it.dateofissue.toLocalDate()
            drcList.addAll(Logic.create!!
                    .select()
                    .from(Tables.DRCATEG)
                    .where(Tables.DRCATEG.DRIVERLICENSE_PK.eq(it.driverlicensePk))
                    .fetch()
                    .into(Drcateg::class.java))
        }
    }


    fun save() {
        try {
            val e =  drLi ?: Driverlicense()
            Logic.comboCheckEmpty("ФИО", persBox)
            e.personPk1 = peopleList[persBox.selectionModel.selectedIndex].personPk
            e.licenseid = Logic.textCheckReg("номер ВУ", "\\d+" , "только цифры", num)
            e.dateofissue = Logic.dateCheckEmpty("дата", date)

            var flag = true
            catView.items.forEach { if (it.checked.value) flag = false }
            if ( flag ) {
                Helpers.alert("Как минимум 1 категория должна быть выбрана")
                throw KekException()
            }

            var id = 0L
            Logic.create!!.transaction { c ->
                if (e.driverlicensePk != null) {
                    val pr = DSL.using(c).newRecord(Tables.DRIVERLICENSE, e)
                    DSL.using(c).executeUpdate(pr)
                    id = e.driverlicensePk
                } else {
                    val pr = DSL.using(c).newRecord(Tables.DRIVERLICENSE, e)
                    pr.store()
                    id = pr.driverlicensePk
                }
            }

            drcList.forEach {
                Logic.create!!
                        .delete(Tables.DRCATEG)
                        .where(Tables.DRCATEG.DRCATEG_PK.eq(it.drcategPk))
                        .execute()
            }

            catView.items.forEach { item ->
                if (item.checked.value) {
                    val temp = Drcateg()
                    temp.categoryPk = catList.find { it.name == item.o }?.categoryPk
                    temp.driverlicensePk = id
                    Logic.create!!.transaction { c ->
                        val pr = DSL.using(c).newRecord(Tables.DRCATEG, temp)
                        pr.store()
                    }
                }
            }

            drLi?.let {
                Logic.unlock(Lock.DRLI, it.driverlicensePk)
                Logic.unlock(Lock.PERSON, it.personPk1)
            }
            EventBus.emit(Events.DRLI_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }

    fun cancel() {
        drLi?.let {
            Logic.unlock(Lock.DRLI, it.driverlicensePk)
            Logic.unlock(Lock.PERSON, it.personPk1)
        }
        currentStage!!.close()
    }
}
