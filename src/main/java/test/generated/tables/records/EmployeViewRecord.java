/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;

import test.generated.tables.EmployeView;


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
public class EmployeViewRecord extends TableRecordImpl<EmployeViewRecord> implements Record7<String, String, String, Long, Long, String, Long> {

    private static final long serialVersionUID = -563026073;

    /**
     * Setter for <code>public.employe_view.FIO</code>.
     */
    public void setFio(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employe_view.FIO</code>.
     */
    public String getFio() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.employe_view.PersonalID</code>.
     */
    public void setPersonalid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employe_view.PersonalID</code>.
     */
    public String getPersonalid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.employe_view.Name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employe_view.Name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employe_view.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employe_view.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.employe_view.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employe_view.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.employe_view.Login</code>.
     */
    public void setLogin(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employe_view.Login</code>.
     */
    public String getLogin() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.employe_view.Position_PK</code>.
     */
    public void setPositionPk(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.employe_view.Position_PK</code>.
     */
    public Long getPositionPk() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Long, Long, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Long, Long, String, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EmployeView.EMPLOYE_VIEW.FIO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmployeView.EMPLOYE_VIEW.PERSONALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployeView.EMPLOYE_VIEW.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EmployeView.EMPLOYE_VIEW.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return EmployeView.EMPLOYE_VIEW.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmployeView.EMPLOYE_VIEW.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return EmployeView.EMPLOYE_VIEW.POSITION_PK;
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
        return getName();
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
    public Long component5() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getPositionPk();
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
        return getName();
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
    public Long value5() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getPositionPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value1(String value) {
        setFio(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value2(String value) {
        setPersonalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value4(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value5(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value6(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord value7(Long value) {
        setPositionPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeViewRecord values(String value1, String value2, String value3, Long value4, Long value5, String value6, Long value7) {
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
     * Create a detached EmployeViewRecord
     */
    public EmployeViewRecord() {
        super(EmployeView.EMPLOYE_VIEW);
    }

    /**
     * Create a detached, initialised EmployeViewRecord
     */
    public EmployeViewRecord(String fio, String personalid, String name, Long personPk, Long employePk, String login, Long positionPk) {
        super(EmployeView.EMPLOYE_VIEW);

        set(0, fio);
        set(1, personalid);
        set(2, name);
        set(3, personPk);
        set(4, employePk);
        set(5, login);
        set(6, positionPk);
    }
}
