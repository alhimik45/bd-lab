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

import test.generated.tables.Protocol;


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
public class ProtocolRecord extends UpdatableRecordImpl<ProtocolRecord> implements Record7<String, String, Long, Long, Long, Long, Date> {

    private static final long serialVersionUID = 480208158;

    /**
     * Setter for <code>public.Protocol.ArticleCop</code>.
     */
    public void setArticlecop(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Protocol.ArticleCop</code>.
     */
    public String getArticlecop() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.Protocol.AddressVioalation</code>.
     */
    public void setAddressvioalation(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Protocol.AddressVioalation</code>.
     */
    public String getAddressvioalation() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.Protocol.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Protocol.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.Protocol.Protocol_PK</code>.
     */
    public void setProtocolPk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Protocol.Protocol_PK</code>.
     */
    public Long getProtocolPk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.Protocol.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Protocol.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.Protocol.Person_PK1</code>.
     */
    public void setPersonPk1(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Protocol.Person_PK1</code>.
     */
    public Long getPersonPk1() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.Protocol.Date</code>.
     */
    public void setDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.Protocol.Date</code>.
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
    public Row7<String, String, Long, Long, Long, Long, Date> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Long, Long, Long, Long, Date> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Protocol.PROTOCOL.ARTICLECOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Protocol.PROTOCOL.ADDRESSVIOALATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Protocol.PROTOCOL.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Protocol.PROTOCOL.PROTOCOL_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Protocol.PROTOCOL.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Protocol.PROTOCOL.PERSON_PK1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return Protocol.PROTOCOL.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getArticlecop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAddressvioalation();
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
        return getProtocolPk();
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
        return getArticlecop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAddressvioalation();
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
        return getProtocolPk();
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
    public ProtocolRecord value1(String value) {
        setArticlecop(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value2(String value) {
        setAddressvioalation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value3(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value4(Long value) {
        setProtocolPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value5(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value6(Long value) {
        setPersonPk1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord value7(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolRecord values(String value1, String value2, Long value3, Long value4, Long value5, Long value6, Date value7) {
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
     * Create a detached ProtocolRecord
     */
    public ProtocolRecord() {
        super(Protocol.PROTOCOL);
    }

    /**
     * Create a detached, initialised ProtocolRecord
     */
    public ProtocolRecord(String articlecop, String addressvioalation, Long personPk, Long protocolPk, Long employePk, Long personPk1, Date date) {
        super(Protocol.PROTOCOL);

        set(0, articlecop);
        set(1, addressvioalation);
        set(2, personPk);
        set(3, protocolPk);
        set(4, employePk);
        set(5, personPk1);
        set(6, date);
    }
}
