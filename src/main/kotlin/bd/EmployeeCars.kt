package bd

import javafx.collections.transformation.FilteredList
import javafx.scene.control.TabPane
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.BorderPane
import test.generated.Tables
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.Appderigistration
import test.generated.tables.pojos.Appregistration
import test.generated.tables.pojos.Driverlicense
import test.generated.tables.pojos.ProtocolView
import test.generated.tables.pojos.Vehicle
import test.generated.tables.pojos.VehicleView
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

        vehicleTable.columnResizePolicy = SmartResize.POLICY

        update()

        searchTransport.textProperty().addListener { _, _, newValue ->
            searchPr.setPredicate { item ->
                if (newValue == null || newValue.isEmpty()) {
                    true
                } else {
                    var flag = true
                    newValue.toLowerCase().split(" ").forEach {
                        if (!(item.fio.toLowerCase().contains(it) ||
                                item.brand.toLowerCase().contains(it) ||
                                item.modelcar.toLowerCase().contains(it) ||
                                item.licensePlate.toLowerCase().contains(it)))
                            flag = false
                    }
                    flag
                }
            }
        }

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
        if (!Logic.lock(Lock.VEH, temp.vehiclePk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        VehicleForm(l).openModal(block = true)
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


