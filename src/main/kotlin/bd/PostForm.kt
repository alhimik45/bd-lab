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


class PostForm(pe:Postdps?  = null) : View("Пост ДПС") {
    override val root: VBox by fxml()

    val address: TextField by fxid()
    val active: CheckBox by fxid()

    val p: Postdps = pe ?: Postdps()


    init {
        address.text = p.address ?: ""
        active.isSelected = p.active ?: true
    }

    fun cancel() {
        if(p.postdpsPk != null)
            Logic.unlock(Lock.POST, p.postdpsPk)
        currentStage!!.close()
    }

    fun save() {
        try {
            p.address = Logic.textCheckEmpty("Адрес", address)
            p.active = active.isSelected

            if (p.postdpsPk != null) {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.POSTDPS, p)
                    DSL.using(c).executeUpdate(pr)
                }
                Logic.unlock(Lock.POST, p.postdpsPk)
            } else {
                Logic.create!!.transaction { c ->
                    val pr = DSL.using(c).newRecord(Tables.POSTDPS, p)
                    pr.store()
                }
            }
            EventBus.emit(Events.POST_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}

