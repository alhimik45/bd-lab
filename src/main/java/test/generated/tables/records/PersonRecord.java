/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Person;


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
public class PersonRecord extends UpdatableRecordImpl<PersonRecord> implements Record6<String, String, String, Date, String, Long> {

    private static final long serialVersionUID = -1577145798;

    /**
     * Setter for <code>public.Person.FIO</code>.
     */
    public void setFio(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Person.FIO</code>.
     */
    public String getFio() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.Person.PassportID</code>.
     */
    public void setPassportid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Person.PassportID</code>.
     */
    public String getPassportid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.Person.PasportSeries</code>.
     */
    public void setPasportseries(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Person.PasportSeries</code>.
     */
    public String getPasportseries() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.Person.DayBirth</code>.
     */
    public void setDaybirth(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Person.DayBirth</code>.
     */
    public Date getDaybirth() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.Person.HomeAddress</code>.
     */
    public void setHomeaddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Person.HomeAddress</code>.
     */
    public String getHomeaddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.Person.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Person.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, Date, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, Date, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Person.PERSON.FIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Person.PERSON.PASSPORTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Person.PERSON.PASPORTSERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Person.PERSON.DAYBIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Person.PERSON.HOMEADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Person.PERSON.PERSON_PK;
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
        return getPassportid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPasportseries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDaybirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHomeaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getPersonPk();
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
        return getPassportid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPasportseries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDaybirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHomeaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value1(String value) {
        setFio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value2(String value) {
        setPassportid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value3(String value) {
        setPasportseries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value4(Date value) {
        setDaybirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value5(String value) {
        setHomeaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value6(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord values(String value1, String value2, String value3, Date value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonRecord
     */
    public PersonRecord() {
        super(Person.PERSON);
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(String fio, String passportid, String pasportseries, Date daybirth, String homeaddress, Long personPk) {
        super(Person.PERSON);

        set(0, fio);
        set(1, passportid);
        set(2, pasportseries);
        set(3, daybirth);
        set(4, homeaddress);
        set(5, personPk);
    }
}
