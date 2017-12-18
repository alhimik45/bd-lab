package bd

import javafx.beans.property.SimpleStringProperty
import javafx.collections.transformation.FilteredList
import javafx.scene.control.*
import javafx.scene.control.cell.PropertyValueFactory
import javafx.stage.FileChooser
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.jooq.DSLContext
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.Tables.VEHICLE_VIEW
import test.generated.tables.pojos.*
import tornadofx.*
import java.io.FileOutputStream
import java.sql.Date
import java.time.LocalDate
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
    private val stata: TableColumn<Appregistration, String> by fxid()
    private val statd: TableColumn<Appderigistration, String> by fxid()


    private val fioC: ComboBox<String> by fxid()
    private val addL: Label by fxid()
    private val dateL: Label by fxid()
    private val catL: Label by fxid()
    private val tsL: ListView<String> by fxid()
    private val peopleList = mutableListOf<Person>()

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
        stata.cellValueFactory = PropertyValueFactory<Appregistration, String>("status")
        statd.cellValueFactory = PropertyValueFactory<Appderigistration, String>("status")
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
        regs.columnResizePolicy = SmartResize.POLICY
        deregs.columnResizePolicy = SmartResize.POLICY


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
        EventBus.on(Events.AREG_UPD) {
            updateReg()
        }
        EventBus.on(Events.ADEREG_UPD) {
            updateDereg()
        }
        EventBus.on(Events.VEH_UPD) { update() }
        EventBus.on(Events.FL_UPD) { updateFios() }

        fioC.valueProperty().addListener { _ ->
            val p = peopleList[fioC.selectionModel.selectedIndex]
            addL.text = p.homeaddress
            dateL.text = p.daybirth.toString()
            val cats = Logic.create!!.select(Tables.CATEGORY.NAME)
                    .from(Tables.DRCATEG)
                    .join(Tables.CATEGORY)
                    .on(Tables.DRCATEG.CATEGORY_PK.eq(Tables.CATEGORY.CATEGORY_PK))
                    .join(Tables.DRIVERLICENSE)
                    .on(Tables.DRCATEG.DRIVERLICENSE_PK.eq(Tables.DRIVERLICENSE.DRIVERLICENSE_PK))
                    .where(Tables.DRIVERLICENSE.PERSON_PK1.eq(p.personPk))
                    .orderBy(Tables.CATEGORY.NAME)
                    .fetch()
                    .into(String::class.java)
            val sss= cats.joinToString(", ")
            catL.text = if (sss.isBlank())  "нет" else sss
            tsL.items.clear()
            val tss = Logic.create!!.fetch("""
                SELECT concat(${Tables.VEHICLE_VIEW.BRAND.qualifiedName}, ' ',
            ${Tables.VEHICLE_VIEW.MODELCAR.qualifiedName}, ' ' ,
             ${Tables.VEHICLE_VIEW.LICENSE_PLATE.qualifiedName})
            FROM ${Tables.VEHICLE_VIEW.name}
            WHERE ${Tables.VEHICLE_VIEW.FIO} = '${p.fio}'
                """).into(String::class.java)
            tsL.items.addAll(tss)
        }

        updateFios()
    }

    fun export(){
        val fileChooser = FileChooser()
        fileChooser.title = "Создать отчет"
        val extFilter = FileChooser.ExtensionFilter("XLSX files (*.xlsx)", "*.xlsx")
        fileChooser.extensionFilters.add(extFilter)
        val file = fileChooser.showSaveDialog(currentWindow) ?: return
        val myWorkBook = XSSFWorkbook()
        val mySheet = myWorkBook.createSheet("Отчёт")
        var rowNum = mySheet.lastRowNum

        var row = mySheet.createRow(rowNum++)
        var cellnum = 0
        var cell = row.createCell(0)
        cell.setCellValue("ФИО")
        cell = row.createCell(1)
        cell.setCellValue(peopleList[fioC.selectionModel.selectedIndex].fio)

        row = mySheet.createRow(rowNum++)
        cell = row.createCell(0)
        cell.setCellValue("Дата рождения")
        cell = row.createCell(1)
        cell.setCellValue(peopleList[fioC.selectionModel.selectedIndex].daybirth.toString())

        row = mySheet.createRow(rowNum++)
        cell = row.createCell(0)
        cell.setCellValue("Адрес")
        cell = row.createCell(1)
        cell.setCellValue(peopleList[fioC.selectionModel.selectedIndex].homeaddress)

        row = mySheet.createRow(rowNum++)
        cell = row.createCell(0)
        cell.setCellValue("Категории вождения")
        cell = row.createCell(1)
        cell.setCellValue(catL.text)
        mySheet.createRow(rowNum++)
        row = mySheet.createRow(rowNum++)
        cell = row.createCell(0)
        cell.setCellValue("Транспортные средства")
        for (o in tsL.items) {
            row = mySheet.createRow(rowNum++)
            cell = row.createCell(0)
            cell.setCellValue(o)
        }
        for (i in 0..7) {
            mySheet.autoSizeColumn(i)
        }
        myWorkBook.write(FileOutputStream(file))
    }

    fun updateFios(){
        peopleList.clear()
        peopleList.addAll(Logic.create!!
                .select()
                .from(Tables.PERSON)
                .fetch()
                .into(Person::class.java))
        fioC.items.clear()
        fioC.items.addAll(peopleList.map { "${it.fio} ${it.pasportseries} ${it.passportid}" })
        fioC.selectionModel.select(0)
    }

    fun odobA() {
        val temp = regs.selectionModel.selectedItem
        if (temp == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }

        val reg = Regcert()

        reg.date = Date.valueOf(LocalDate.now())
        reg.employePk = Logic.user?.employePk
        reg.personPk = Logic.user?.personPk
        reg.personPk1 = temp.personPk1
        reg.vehiclePk = temp.vehiclePk

        Logic.create!!.transaction { c ->
            val pr = DSL.using(c).newRecord(Tables.REGCERT, reg)
            pr.store()
        }

        Logic.create!!
                .update(Tables.APPREGISTRATION)
                .set(Tables.APPREGISTRATION.STATUS, "Одобрено")
                .where(Tables.APPREGISTRATION.APPREGISTRATION_PK.eq(temp.appregistrationPk))
                .execute()
        EventBus.emit(Events.AREG_UPD)
        EventBus.emit(Events.VEH_UPD)
        Helpers.mes("Статус записи изменен на Одобрено")
    }

    fun odobD() {
        val temp = deregs.selectionModel.selectedItem
        if (temp == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }

        val reg = Logic.create!!
                .select()
                .from(Tables.REGCERT)
                .where(Tables.REGCERT.REGCERT_PK.eq(temp.regcertPk))
                .fetchOne()
                .into(Regcert::class.java)

        reg.enddate = Date.valueOf(LocalDate.now())

        Logic.create!!.transaction { c ->
            val pr = DSL.using(c).newRecord(Tables.REGCERT, reg)
            DSL.using(c).executeUpdate(pr)
        }

        Logic.create!!
                .update(Tables.APPDERIGISTRATION)
                .set(Tables.APPDERIGISTRATION.STATUS, "Одобрено")
                .where(Tables.APPDERIGISTRATION.APPDERIGISTRATION_PK.eq(temp.appderigistrationPk))
                .execute()
        EventBus.emit(Events.ADEREG_UPD)
        EventBus.emit(Events.VEH_UPD)
        Helpers.mes("Статус записи изменен на Одобрено")
    }

    fun rejectA() {
        val temp = regs.selectionModel.selectedItem
        if (temp == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }
        Logic.create!!
                .update(Tables.APPREGISTRATION)
                .set(Tables.APPREGISTRATION.STATUS, "Отказано")
                .where(Tables.APPREGISTRATION.APPREGISTRATION_PK.eq(temp.appregistrationPk))
                .execute()
        EventBus.emit(Events.AREG_UPD)
        Helpers.mes("Статус записи изменен на Отказано")
    }

    fun rejectD(){
        val temp = deregs.selectionModel.selectedItem
        if (temp == null){
            Helpers.alert("Необходимо выбрать запись для редактирования")
            return
        }
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }
        Logic.create!!
                .update(Tables.APPDERIGISTRATION)
                .set(Tables.APPDERIGISTRATION.STATUS, "Отказано")
                .where(Tables.APPDERIGISTRATION.APPDERIGISTRATION_PK.eq(temp.appderigistrationPk))
                .execute()
        EventBus.emit(Events.ADEREG_UPD)
        Helpers.mes("Статус записи изменен на Отказано")
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
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }
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
        if (temp.status != "Рассматривается") {
            Helpers.alert("Запись уже рассмотрена")
            return
        }
        if (!Logic.lock(Lock.APPDEREG, temp.appderigistrationPk)) {
            Helpers.alert("Данная запись редактируется другим пользователем")
            return
        }
        DeregForm(temp).openModal(block = true)
    }

}


