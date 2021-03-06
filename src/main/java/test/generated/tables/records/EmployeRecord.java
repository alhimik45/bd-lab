/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Employe;


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
public class EmployeRecord extends UpdatableRecordImpl<EmployeRecord> implements Record6<String, Long, Long, Long, String, String> {

    private static final long serialVersionUID = -1145397279;

    /**
     * Setter for <code>public.Employe.PersonalID</code>.
     */
    public void setPersonalid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Employe.PersonalID</code>.
     */
    public String getPersonalid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.Employe.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Employe.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.Employe.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Employe.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.Employe.Position_PK</code>.
     */
    public void setPositionPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Employe.Position_PK</code>.
     */
    public Long getPositionPk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.Employe.Login</code>.
     */
    public void setLogin(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Employe.Login</code>.
     */
    public String getLogin() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.Employe.Password</code>.
     */
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Employe.Password</code>.
     */
    public String getPassword() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Employe.EMPLOYE.PERSONALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Employe.EMPLOYE.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Employe.EMPLOYE.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Employe.EMPLOYE.POSITION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Employe.EMPLOYE.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Employe.EMPLOYE.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPersonalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getPositionPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPersonalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getPositionPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value1(String value) {
        setPersonalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value2(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value3(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value4(Long value) {
        setPositionPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value5(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord value6(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeRecord values(String value1, Long value2, Long value3, Long value4, String value5, String value6) {
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
     * Create a detached EmployeRecord
     */
    public EmployeRecord() {
        super(Employe.EMPLOYE);
    }

    /**
     * Create a detached, initialised EmployeRecord
     */
    public EmployeRecord(String personalid, Long employePk, Long personPk, Long positionPk, String login, String password) {
        super(Employe.EMPLOYE);

        set(0, personalid);
        set(1, employePk);
        set(2, personPk);
        set(3, positionPk);
        set(4, login);
        set(5, password);
    }
}
