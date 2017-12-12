/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Distrorder;


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
public class DistrorderRecord extends UpdatableRecordImpl<DistrorderRecord> implements Record4<Date, Long, Long, Long> {

    private static final long serialVersionUID = 261296858;

    /**
     * Setter for <code>public.DistrOrder.DateOrder</code>.
     */
    public void setDateorder(Date value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.DistrOrder.DateOrder</code>.
     */
    public Date getDateorder() {
        return (Date) get(0);
    }

    /**
     * Setter for <code>public.DistrOrder.DistrOrder_PK</code>.
     */
    public void setDistrorderPk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.DistrOrder.DistrOrder_PK</code>.
     */
    public Long getDistrorderPk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.DistrOrder.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.DistrOrder.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.DistrOrder.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.DistrOrder.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Date, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Date, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field1() {
        return Distrorder.DISTRORDER.DATEORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Distrorder.DISTRORDER.DISTRORDER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Distrorder.DISTRORDER.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Distrorder.DISTRORDER.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component1() {
        return getDateorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDistrorderPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value1() {
        return getDateorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDistrorderPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrorderRecord value1(Date value) {
        setDateorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrorderRecord value2(Long value) {
        setDistrorderPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrorderRecord value3(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrorderRecord value4(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrorderRecord values(Date value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DistrorderRecord
     */
    public DistrorderRecord() {
        super(Distrorder.DISTRORDER);
    }

    /**
     * Create a detached, initialised DistrorderRecord
     */
    public DistrorderRecord(Date dateorder, Long distrorderPk, Long employePk, Long personPk) {
        super(Distrorder.DISTRORDER);

        set(0, dateorder);
        set(1, distrorderPk);
        set(2, employePk);
        set(3, personPk);
    }
}