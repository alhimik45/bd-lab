/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Appderigistration;


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
public class AppderigistrationRecord extends UpdatableRecordImpl<AppderigistrationRecord> implements Record7<String, Long, Long, Long, Long, Long, Date> {

    private static final long serialVersionUID = 2099107842;

    /**
     * Setter for <code>public.AppDerigistration.Content</code>.
     */
    public void setContent(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.Content</code>.
     */
    public String getContent() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.AppDerigistration.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.AppDerigistration.RegCert_PK</code>.
     */
    public void setRegcertPk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.RegCert_PK</code>.
     */
    public Long getRegcertPk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.AppDerigistration.AppDerigistration_PK</code>.
     */
    public void setAppderigistrationPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.AppDerigistration_PK</code>.
     */
    public Long getAppderigistrationPk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.AppDerigistration.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.AppDerigistration.Person_PK1</code>.
     */
    public void setPersonPk1(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.Person_PK1</code>.
     */
    public Long getPersonPk1() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.AppDerigistration.Date</code>.
     */
    public void setDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.AppDerigistration.Date</code>.
     */
    public Date getDate() {
        return (Date) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Long, Long, Long, Date> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, Long, Long, Long, Date> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Appderigistration.APPDERIGISTRATION.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Appderigistration.APPDERIGISTRATION.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Appderigistration.APPDERIGISTRATION.REGCERT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Appderigistration.APPDERIGISTRATION.APPDERIGISTRATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Appderigistration.APPDERIGISTRATION.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Appderigistration.APPDERIGISTRATION.PERSON_PK1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return Appderigistration.APPDERIGISTRATION.DATE;
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
        return getRegcertPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getAppderigistrationPk();
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
        return getRegcertPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getAppderigistrationPk();
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
    public AppderigistrationRecord value1(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value2(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value3(Long value) {
        setRegcertPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value4(Long value) {
        setAppderigistrationPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value5(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value6(Long value) {
        setPersonPk1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord value7(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppderigistrationRecord values(String value1, Long value2, Long value3, Long value4, Long value5, Long value6, Date value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AppderigistrationRecord
     */
    public AppderigistrationRecord() {
        super(Appderigistration.APPDERIGISTRATION);
    }

    /**
     * Create a detached, initialised AppderigistrationRecord
     */
    public AppderigistrationRecord(String content, Long personPk, Long regcertPk, Long appderigistrationPk, Long employePk, Long personPk1, Date date) {
        super(Appderigistration.APPDERIGISTRATION);

        set(0, content);
        set(1, personPk);
        set(2, regcertPk);
        set(3, appderigistrationPk);
        set(4, employePk);
        set(5, personPk1);
        set(6, date);
    }
}
