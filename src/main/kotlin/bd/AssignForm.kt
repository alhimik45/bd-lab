package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import test.generated.Tables
import test.generated.tables.pojos.Assignment
import test.generated.tables.pojos.EmployeView
import test.generated.tables.pojos.Postdps
import tornadofx.View


class AssignForm(pe: Assignment? = null) : View("Распределение") {
    override val root: VBox by fxml()

    val post: ComboBox<String> by fxid()
    val emp: ComboBox<String> by fxid()
    val date: DatePicker by fxid()

    val p: Assignment = pe ?: Assignment()


    init {
        updatePost()
        if (p.postdpsPk != null) {
            post.selectionModel.select(Logic.create!!.select().from(Tables.POSTDPS).where(Tables.POSTDPS.POSTDPS_PK.eq(p.postdpsPk)).fetchOne().into(Postdps::class.java).address)
        }
        updateEmp()
        if (p.employePk != null) {
            emp.selectionModel.select(Logic.create!!.select().from(Tables.EMPLOYE_VIEW).where(Tables.EMPLOYE_VIEW.EMPLOYE_PK.eq(p.employePk)).fetchOne().into(EmployeView::class.java).let { "${it.fio}(${it.personalid})" })
        }
        if (p.date != null)
            date.value = p.date.toLocalDate()
    }

    fun updatePost() {
        post.items.clear()
        post.items.addAll(Logic.create!!.select().from(Tables.POSTDPS).fetch().into(Postdps::class.java).map { it.address })
    }

    fun updateEmp() {
        emp.items.clear()
        emp.items.addAll(Logic.create!!.select().from(Tables.EMPLOYE_VIEW).where(Tables.EMPLOYE_VIEW.POSITION_PK.eq(2)).fetch().into(EmployeView::class.java).map { "${it.fio}(${it.personalid})" })
    }

    fun cancel() {
        if (p.postdpsPk != null)
            Logic.unlock(Lock.POST, p.postdpsPk)
        currentStage!!.close()
    }

    fun save() {
        Logic.sn = true
        savenext()
        Logic.sn = false

    }

    fun savenext() {
        try {
            val v1 = Logic.comboCheckEmpty("Пост", post)
            p.postdpsPk = Logic.create!!.select().from(Tables.POSTDPS).where(Tables.POSTDPS.ADDRESS.eq(v1)).fetchOne().into(Postdps::class.java).postdpsPk
            val v2 = Logic.comboCheckEmpty("Сотрудник", emp)
            val v3 = Logic.create!!.select().from(Tables.EMPLOYE_VIEW).where(Tables.EMPLOYE_VIEW.FIO.eq(v2.split("(")[0])).fetchOne().into(EmployeView::class.java)
            p.employePk = v3.employePk
            p.date = Logic.dateCheckEmpty("Дата работы", date)
            p.personPk = v3.personPk

            if (p.assignmentPk != null) {
                val pr = Logic.create!!.newRecord(Tables.ASSIGNMENT, p)
                Logic.create!!.executeUpdate(pr)
                Logic.unlock(Lock.ASS, p.assignmentPk)
            } else {
                val pr = Logic.create!!.newRecord(Tables.ASSIGNMENT, p)
                pr.store()
            }
            EventBus.emit(Events.ASS_UPD)
            if(Logic.sn) currentStage!!.close()
        } catch (e: KekException) {

        }
        p.assignmentPk = 0
    }
}

