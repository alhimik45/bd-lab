package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.*
import java.sql.Date

class DeregForm(val re: Appderigistration? = null) : View("Заявление о снятии с учёта") {
    override val root: VBox by fxml()
    private val tsBox: ComboBox<String> by fxid()
    private val datePick: DatePicker by fxid()
    private var aaa: MutableList<RegCertView> = Logic.create!!
            .select()
            .from(Tables.REG_CERT_VIEW)
            .fetch()
            .into(RegCertView::class.java)

    init {
        tsBox.items.addAll(aaa
                .map { "${it.brand} ${it.modelcar}, ${it.licensePlate}" })
        re?.let {
            tsBox.selectionModel.select(Logic.create!!
                    .select()
                    .from(Tables.REG_CERT_VIEW)
                    .where(Tables.REG_CERT_VIEW.VEHICLE_PK.eq(it.regcertPk))
                    .fetchOne()
                    .into(RegCertView::class.java)
                    .let { "${it.brand} ${it.modelcar}, ${it.licensePlate}" })
            datePick.value = it.date.toLocalDate()
        }
    }

    fun save() {
        try {
            val rre = re ?: Appderigistration()
            Logic.comboCheckEmpty("Свидетельство о регистрации", tsBox)
            rre.date = Logic.dateCheckEmpty("Дата", datePick)
            rre.regcertPk = aaa[tsBox.selectionModel.selectedIndex].regcertPk
            rre.personPk1 = aaa[tsBox.selectionModel.selectedIndex].personPk1

            Logic.create!!.transaction { c ->
                val pr = DSL.using(c).newRecord(Tables.APPDERIGISTRATION, rre)
                if (rre.appderigistrationPk != null) {
                    DSL.using(c).executeUpdate(pr)
                } else {
                    pr.store()
                }
            }
            re?.let {
                Logic.unlock(Lock.APPDEREG, it.appderigistrationPk)
            }
            EventBus.emit(Events.ADEREG_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }

    fun cancel() {
        re?.let {
            Logic.unlock(Lock.APPDEREG, it.appderigistrationPk)
        }
        currentStage!!.close()
    }
}
