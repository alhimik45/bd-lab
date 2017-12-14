package bd

import javafx.scene.control.ColorPicker
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import org.jooq.impl.DSL
import sun.rmi.runtime.Log
import test.generated.Sequences
import test.generated.Tables
import test.generated.tables.pojos.*
import tornadofx.*

class VehicleForm(val ve: Vehicle? = null,
                  val pts: Pts? = null,
                  val vi: VehicleView? = null) : View("Транспортное средство") {

    override val root: VBox by fxml()

    private val vin: TextField by fxid()
    private val br: TextField by fxid()
    private val model: TextField by fxid()
    private val col: TextField by fxid()
    private val god: TextField by fxid()
    private val ndvig: TextField by fxid()
    private val nkuz: TextField by fxid()
    private val power: TextField by fxid()
    private val cap: TextField by fxid()
    private val maxwes: TextField by fxid()
    private val minwes: TextField by fxid()
    private val nhod: TextField by fxid()
    private val lp: TextField by fxid()

    private val date: DatePicker by fxid()

    private val dvigtype: ComboBox<String> by fxid()
    private val cat: ComboBox<String> by fxid()

    private var catList = mutableListOf<Category>()
    private var dtList = mutableListOf<Enginetype>()

    init {
        catList = Logic.create!!
                .select()
                .from(Tables.CATEGORY)
                .fetch()
                .into(Category::class.java)
        dtList = Logic.create!!
                .select()
                .from(Tables.ENGINETYPE)
                .fetch()
                .into(Enginetype::class.java)
        cat.items.addAll(catList.map { it.name })
        dvigtype.items.addAll(dtList.map { it.name })

        pts?.let { p ->
            vin.text = p.vin?:""
            br.text = p.brand?:""
            model.text = p.modelcar?:""
            col.text = p.bodycolor?:""
            god.text = p.yearofman?.toString()
            cat.selectionModel.select(catList.indexOfFirst { q -> q.categoryPk == p.categoryPk } )
            dvigtype.selectionModel.select(dtList.indexOfFirst { q -> q.enginetypePk == p.enginetypePk } )
            ndvig.text = p.engineid?:""
            nkuz.text = p.bodyid?:""
            nhod.text = p.Сhassisid?:""
            power.text = p.power?.toString()
            cap.text = p.workcapacity?.toString()
            maxwes.text = p.maxweight?.toString()
            minwes.text = p.unloadweight?.toString()
            lp.text = vi?.licensePlate?:""
            date.value = p.date.toLocalDate()
        }
    }

    fun cancel() {
        ve?.let { veh ->
            pts?.let {
                Logic.unlock(Lock.VEH, veh.vehiclePk)
                Logic.lock(Lock.PTS, it.ptsPk)
            }
        }
        currentStage!!.close()
    }

    fun save() {
        try {
            val v = ve ?: Vehicle()
            val p = pts ?: Pts()
            Logic.comboCheckEmpty("категория", cat)
            Logic.comboCheckEmpty("тип двигателя", dvigtype)
            p.categoryPk = catList[cat.selectionModel.selectedIndex].categoryPk
            p.enginetypePk = dtList[dvigtype.selectionModel.selectedIndex].enginetypePk

            p.brand = Logic.textCheckEmpty("бренд", br)
            p.modelcar = Logic.textCheckEmpty("модель", model)
            p.bodycolor = Logic.textCheckEmpty("цвет", col)

            p.maxweight = Logic.textCheckReg("максимальный вес",
                    "\\d+",
                    "допускаются только целые числа",
                    maxwes).toInt()
            p.unloadweight = Logic.textCheckReg("вес без нагрузки",
                    "\\d+",
                    "допускаются только целые числа",
                    minwes).toInt()
            p.power = Logic.textCheckReg("мощность",
                    "\\d+",
                    "допускаются только целые числа",
                    power).toInt()
            p.workcapacity = Logic.textCheckReg("рабочий объем",
                    "\\d+",
                    "допускаются только целые числа",
                    power).toInt()
            p.yearofman = Logic.textCheckReg("",
                    "^(19|20)\\d{2}\$",
                    "год от 1900 до 2099",
                    god).toInt()


            p.date = Logic.dateCheckEmpty("дата выдачи", date)

            p.vin = vin.text
            p.bodyid = nkuz.text
            p.engineid = ndvig.text
            p.Сhassisid = nhod.text

            if(v.vehiclePk == null) {
                Logic.create!!
                        .insertInto(Tables.VEHICLE, Tables.VEHICLE.VEHICLE_PK)
                        .values(Sequences.VEHICLE_VEHICLE_PK_SEQ.nextval())
                        .execute()
                p.vehiclePk = Logic.create!!
                        .select()
                        .from(Tables.VEHICLE)
                        .fetch()
                        .into(Vehicle::class.java)
                        .last()
                        .vehiclePk
            }

            Logic.create!!.transaction { c ->
                if (p.ptsPk != null) {
                    val pr = DSL.using(c).newRecord(Tables.PTS, p)
                    DSL.using(c).executeUpdate(pr)
                } else {
                    val er = DSL.using(c).newRecord(Tables.PTS, p)
                    er.store()
                }
            }
            ve?.let { veh ->
                pts?.let {
                    Logic.unlock(Lock.VEH, veh.vehiclePk)
                    Logic.lock(Lock.PTS, it.ptsPk)
                }
            }
            EventBus.emit(Events.VEH_UPD)
            currentStage!!.close()
        } catch (e: KekException) {

        }
    }
}
