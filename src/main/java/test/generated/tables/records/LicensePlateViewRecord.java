/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import test.generated.tables.LicensePlateView;


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
public class LicensePlateViewRecord extends TableRecordImpl<LicensePlateViewRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = -447772868;

    /**
     * Setter for <code>public.license_plate_view.license_plate</code>.
     */
    public void setLicensePlate(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.license_plate_view.license_plate</code>.
     */
    public String getLicensePlate() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.license_plate_view.LicensePlate_PK</code>.
     */
    public void setLicenseplatePk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.license_plate_view.LicensePlate_PK</code>.
     */
    public Long getLicenseplatePk() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LicensePlateView.LICENSE_PLATE_VIEW.LICENSE_PLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LicensePlateView.LICENSE_PLATE_VIEW.LICENSEPLATE_PK;
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
    public Long component2() {
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
    public Long value2() {
        return getLicenseplatePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicensePlateViewRecord value1(String value) {
        setLicensePlate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicensePlateViewRecord value2(Long value) {
        setLicenseplatePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicensePlateViewRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LicensePlateViewRecord
     */
    public LicensePlateViewRecord() {
        super(LicensePlateView.LICENSE_PLATE_VIEW);
    }

    /**
     * Create a detached, initialised LicensePlateViewRecord
     */
    public LicensePlateViewRecord(String licensePlate, Long licenseplatePk) {
        super(LicensePlateView.LICENSE_PLATE_VIEW);

        set(0, licensePlate);
        set(1, licenseplatePk);
    }
}