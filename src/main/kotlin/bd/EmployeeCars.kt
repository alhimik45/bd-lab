package bd

import javafx.beans.property.SimpleStringProperty
import javafx.collections.transformation.FilteredList
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import test.generated.Tables
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.*
import tornadofx.*
import java.util.*


class EmployeeCars : View("Учёт транспортных средств") {
    override val root: TabPane by fxml()
    private val vehicleTable: TableView<VehicleView> by fxid()
    private val regs: TableView<Appregistration> by fxid()
    private val deregs: TableView<Appderigistration> by fxid()
    private val licPlate: TableColumn<VehicleView, String> by fxid()
    private val model: TableColumn<VehicleView, String> by fxid()
    private val brand: TableColumn<VehicleView, String> by fxid()
    private val fio: TableColumn<VehicleView, String> by fxid()
    private val status: TableColumn<VehicleView, String> by fxid()
    private val beg: TableColumn<VehicleView, Date> by fxid()
    private val end: TableColumn<VehicleView, Date> by fxid()
    private val vlad: TableColumn<Appregistration, String> by fxid()
    private val ts: TableColumn<Appregistration, String> by fxid()
    private val tss: TableColumn<Appderigistration, String> by fxid()
    private val dataa: TableColumn<Appregistration, Date> by fxid()
    private val dataaaa: TableColumn<Appderigistration, Date> by fxid()

    private val searchTransport: TextField by fxid()
    private var dataTs = vehicleTable.items
    private var searchPr = FilteredList<VehicleView>(dataTs){ _ -> true}

    init {
        brand.cellValueFactory = PropertyValueFactory<VehicleView, String>("brand")
        model.cellValueFactory = PropertyValueFactory<VehicleView, String>("modelcar")
        licPlate.cellValueFactory = PropertyValueFactory<VehicleView, String>("licensePlate")
        fio.cellValueFactory = PropertyValueFactory<VehicleView, String>("fio")
        status.cellValueFactory = PropertyValueFactory<VehicleView, String>("status")
        beg.cellValueFactory = PropertyValueFactory<VehicleView, Date>("begDate")
        end.cellValueFactory = PropertyValueFactory<VehicleView, Date>("endDate")
        dataa.cellValueFactory = PropertyValueFactory<Appregistration, Date>("date")
        dataaaa.cellValueFactory = PropertyValueFactory<Appderigistration, Date>("date")
        vlad.setCellValueFactory {
            SimpleStringProperty(Logic.create!!
                    .select()
                    .from(Tables.PERSON)
                    .where(Tables.PERSON.PERSON_PK.eq(it.value.personPk1))
                    .fetchOne()
                    .into(Person::class.java)
                    .fio)
        }
        ts.setCellValueFactory {
            SimpleStringProperty(Logic.create!!
                    .select()
                    .from(Tables.PTS)
                    .where(Tables.PTS.VEHICLE_PK.eq(it.value.vehiclePk))
                    .orderBy(Tables.PTS.DATE)
                    .fetch()[0]
                    .into(Pts::class.java)
                    .let { "${it.brand} ${it.modelcar}, ${it.vin}" })
        }
        tss.setCellValueFactory {
            SimpleStringProperty(Logic.create!!
                    .select()
                    .from(Tables.REG_CERT_VIEW)
                    .where(Tables.REG_CERT_VIEW.REGCERT_PK.eq(it.value.regcertPk))
                    .fetchOne()
                    .into(RegCertView::class.java)
                    .let { "${it.brand} ${it.modelcar}, ${it.licensePlate}" })
        }



        vehicleTable.columnResizePolicy = SmartResize.POLICY

        update()
        updateReg()
        updateDereg()
        searchTransport.textProperty().addListener { _, _, newValue ->
            searchPr.setPredicate { item ->
                if (newValue == null || newValue.isEmpty()) {
                    true
                } else {
                    var flag = true
                    newValue.toLowerCase().split(" ").forEach {
                        if (!(item.fio?.toLowerCase()?.contains(it) == true ||
                                item.brand?.toLowerCase()?.contains(it) == true ||
                                item.modelcar?.toLowerCase()?.contains(it) == true ||
                                item.licensePlate?.toLowerCase()?.contains(it) == true))
                            flag = false
                    }
                    flag
                }
            }
        }
        EventBus.on(Events.AREG_UPD) {updateReg()}
        EventBus.on(Events.ADEREG_UPD) {updateDereg()}
        EventBus.on(Events.VEH_UPD) { update() }
    }

    fun update() {
        dataTs.clear()
        dataTs.addAll(Logic.create!!
                .select()
                .from(VEHICLE_VIEW)
                .fetch()
                .into(VehicleView::class.java)!!
                .asIterable())
        searchPr = FilteredList<VehicleView>(dataTs){ _ -> true }
        vehicleTable.items = searchPr
    }

    fun updateReg() {
        val data = regs.items
        data.clear()
        data.addAll(Logic.create!!
                .select()
                .from(Tables.APPREGISTRATION)
                .fetch()
                .into(Appregistration::class.java)!!
                .asIterable())
    }

    fun updateDereg() {
        val data = deregs.items
        data.clear()
        data.addAll(Logic.create!!
                .select()
                .from(Tables.APPDERIGISTRATION)
                .fetch()
                .into(Appderigistration::class.java)!!
                .asIterable())
    }

    fun newVehicle() {
        VehicleForm().openModal(block = true)
    }

    fun modVehicle() {
        if (vehicleTable.selectionModel.selectedItem == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = vehicleTable.selectionModel.selectedItem
        val l = Logic.create!!
                .select()
                .from(Tables.VEHICLE)
                .where(Tables.VEHICLE.VEHICLE_PK.eq(temp.vehiclePk))
                .fetchOne()
                .into(Vehicle::class.java)
        val pts = Logic.create!!
                .select()
                .from(Tables.PTS)
                .where(Tables.PTS.PTS_PK.eq(temp.ptsPk))
                .fetchOne()
                .into(Pts::class.java)
        if (!Logic.lock(Lock.VEH, temp.vehiclePk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }

        if (!Logic.lock(Lock.PTS, temp.ptsPk)) {
            Logic.unlock(Lock.VEH, temp.vehiclePk)
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }

        VehicleForm(l, pts, temp).openModal(block = true)
    }


    fun addReg(){
        RegForm().openModal(block = true)
    }

    fun editReg(){
        if (regs.selectionModel.selectedItem == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = regs.selectionModel.selectedItem

        if (!Logic.lock(Lock.APPREG, temp.appregistrationPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        RegForm(temp).openModal(block = true)
    }

    fun addDereg(){
        DeregForm().openModal(block = true)
    }

    fun editDereg(){
        if (deregs.selectionModel.selectedItem == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        val temp = deregs.selectionModel.selectedItem

        if (!Logic.lock(Lock.APPDEREG, temp.appderigistrationPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        DeregForm(temp).openModal(block = true)
    }

}


