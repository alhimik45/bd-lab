/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;

import test.generated.tables.VehicleView;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VehicleViewRecord extends TableRecordImpl<VehicleViewRecord> implements Record10<String, String, String, String, String, Date, Date, Long, Long, Long> {

    private static final long serialVersionUID = -2026211485;

    /**
     * Setter for <code>public.vehicle_view.license_plate</code>.
     */
    public void setLicensePlate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.vehicle_view.license_plate</code>.
     */
    public String getLicensePlate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.vehicle_view.ModelCar</code>.
     */
    public void setModelcar(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.vehicle_view.ModelCar</code>.
     */
    public String getModelcar() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.vehicle_view.Brand</code>.
     */
    public void setBrand(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.vehicle_view.Brand</code>.
     */
    public String getBrand() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.vehicle_view.fio</code>.
     */
    public void setFio(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.vehicle_view.fio</code>.
     */
    public String getFio() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.vehicle_view.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.vehicle_view.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.vehicle_view.beg_date</code>.
     */
    public void setBegDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.vehicle_view.beg_date</code>.
     */
    public Date getBegDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>public.vehicle_view.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.vehicle_view.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>public.vehicle_view.Vehicle_PK</code>.
     */
    public void setVehiclePk(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.vehicle_view.Vehicle_PK</code>.
     */
    public Long getVehiclePk() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.vehicle_view.PTS_PK</code>.
     */
    public void setPtsPk(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.vehicle_view.PTS_PK</code>.
     */
    public Long getPtsPk() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>public.vehicle_view.LicensePlate_PK</code>.
     */
    public void setLicenseplatePk(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.vehicle_view.LicensePlate_PK</code>.
     */
    public Long getLicenseplatePk() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, Date, Date, Long, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, Date, Date, Long, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return VehicleView.VEHICLE_VIEW.LICENSE_PLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return VehicleView.VEHICLE_VIEW.MODELCAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return VehicleView.VEHICLE_VIEW.BRAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return VehicleView.VEHICLE_VIEW.FIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return VehicleView.VEHICLE_VIEW.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return VehicleView.VEHICLE_VIEW.BEG_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return VehicleView.VEHICLE_VIEW.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return VehicleView.VEHICLE_VIEW.VEHICLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return VehicleView.VEHICLE_VIEW.PTS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return VehicleView.VEHICLE_VIEW.LICENSEPLATE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLicensePlate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getModelcar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBrand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getBegDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPtsPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getLicenseplatePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLicensePlate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getModelcar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBrand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getBegDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPtsPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getLicenseplatePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value1(String value) {
        setLicensePlate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value2(String value) {
        setModelcar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value3(String value) {
        setBrand(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value4(String value) {
        setFio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value6(Date value) {
        setBegDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value7(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value8(Long value) {
        setVehiclePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value9(Long value) {
        setPtsPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord value10(Long value) {
        setLicenseplatePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleViewRecord values(String value1, String value2, String value3, String value4, String value5, Date value6, Date value7, Long value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VehicleViewRecord
     */
    public VehicleViewRecord() {
        super(VehicleView.VEHICLE_VIEW);
    }

    /**
     * Create a detached, initialised VehicleViewRecord
     */
    public VehicleViewRecord(String licensePlate, String modelcar, String brand, String fio, String status, Date begDate, Date endDate, Long vehiclePk, Long ptsPk, Long licenseplatePk) {
        super(VehicleView.VEHICLE_VIEW);

        set(0, licensePlate);
        set(1, modelcar);
        set(2, brand);
        set(3, fio);
        set(4, status);
        set(5, begDate);
        set(6, endDate);
        set(7, vehiclePk);
        set(8, ptsPk);
        set(9, licenseplatePk);
    }
}
