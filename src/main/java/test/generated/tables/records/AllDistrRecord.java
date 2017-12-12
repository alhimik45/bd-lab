/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;

import test.generated.tables.AllDistr;


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
public class AllDistrRecord extends TableRecordImpl<AllDistrRecord> implements Record4<String, String, String, Date> {

    private static final long serialVersionUID = -901680656;

    /**
     * Setter for <code>public.all_distr.FIO</code>.
     */
    public void setFio(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.all_distr.FIO</code>.
     */
    public String getFio() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.all_distr.PersonalID</code>.
     */
    public void setPersonalid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.all_distr.PersonalID</code>.
     */
    public String getPersonalid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.all_distr.Address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.all_distr.Address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.all_distr.DateOrder</code>.
     */
    public void setDateorder(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.all_distr.DateOrder</code>.
     */
    public Date getDateorder() {
        return (Date) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AllDistr.ALL_DISTR.FIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AllDistr.ALL_DISTR.PERSONALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AllDistr.ALL_DISTR.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return AllDistr.ALL_DISTR.DATEORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPersonalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDateorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFio();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPersonalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDateorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AllDistrRecord value1(String value) {
        setFio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AllDistrRecord value2(String value) {
        setPersonalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AllDistrRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AllDistrRecord value4(Date value) {
        setDateorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AllDistrRecord values(String value1, String value2, String value3, Date value4) {
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
     * Create a detached AllDistrRecord
     */
    public AllDistrRecord() {
        super(AllDistr.ALL_DISTR);
    }

    /**
     * Create a detached, initialised AllDistrRecord
     */
    public AllDistrRecord(String fio, String personalid, String address, Date dateorder) {
        super(AllDistr.ALL_DISTR);

        set(0, fio);
        set(1, personalid);
        set(2, address);
        set(3, dateorder);
    }
}