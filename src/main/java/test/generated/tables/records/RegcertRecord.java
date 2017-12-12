/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Regcert;


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
public class RegcertRecord extends UpdatableRecordImpl<RegcertRecord> implements Record8<String, Long, Long, Long, Long, Long, Date, Date> {

    private static final long serialVersionUID = 1022873278;

    /**
     * Setter for <code>public.RegCert.Content</code>.
     */
    public void setContent(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.RegCert.Content</code>.
     */
    public String getContent() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.RegCert.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.RegCert.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.RegCert.Vehicle_PK</code>.
     */
    public void setVehiclePk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.RegCert.Vehicle_PK</code>.
     */
    public Long getVehiclePk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.RegCert.RegCert_PK</code>.
     */
    public void setRegcertPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.RegCert.RegCert_PK</code>.
     */
    public Long getRegcertPk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.RegCert.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.RegCert.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.RegCert.Person_PK1</code>.
     */
    public void setPersonPk1(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.RegCert.Person_PK1</code>.
     */
    public Long getPersonPk1() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.RegCert.Date</code>.
     */
    public void setDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.RegCert.Date</code>.
     */
    public Date getDate() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>public.RegCert.EndDate</code>.
     */
    public void setEnddate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.RegCert.EndDate</code>.
     */
    public Date getEnddate() {
        return (Date) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Long, Long, Long, Long, Date, Date> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Long, Long, Long, Long, Date, Date> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Regcert.REGCERT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Regcert.REGCERT.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Regcert.REGCERT.VEHICLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Regcert.REGCERT.REGCERT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Regcert.REGCERT.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Regcert.REGCERT.PERSON_PK1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return Regcert.REGCERT.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return Regcert.REGCERT.ENDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRegcertPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getPersonPk1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component7() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component8() {
        return getEnddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRegcertPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPersonPk1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getEnddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value1(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value2(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value3(Long value) {
        setVehiclePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value4(Long value) {
        setRegcertPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value5(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value6(Long value) {
        setPersonPk1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value7(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord value8(Date value) {
        setEnddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegcertRecord values(String value1, Long value2, Long value3, Long value4, Long value5, Long value6, Date value7, Date value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegcertRecord
     */
    public RegcertRecord() {
        super(Regcert.REGCERT);
    }

    /**
     * Create a detached, initialised RegcertRecord
     */
    public RegcertRecord(String content, Long personPk, Long vehiclePk, Long regcertPk, Long employePk, Long personPk1, Date date, Date enddate) {
        super(Regcert.REGCERT);

        set(0, content);
        set(1, personPk);
        set(2, vehiclePk);
        set(3, regcertPk);
        set(4, employePk);
        set(5, personPk1);
        set(6, date);
        set(7, enddate);
    }
}