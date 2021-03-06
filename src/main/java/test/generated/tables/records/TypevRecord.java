/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Typev;


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
public class TypevRecord extends UpdatableRecordImpl<TypevRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = 260969710;

    /**
     * Setter for <code>public.TypeV.Name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.TypeV.Name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.TypeV.TypeV_PK</code>.
     */
    public void setTypevPk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.TypeV.TypeV_PK</code>.
     */
    public Long getTypevPk() {
        return (Long) get(1);
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
        return Typev.TYPEV.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Typev.TYPEV.TYPEV_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTypevPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTypevPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypevRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypevRecord value2(Long value) {
        setTypevPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypevRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TypevRecord
     */
    public TypevRecord() {
        super(Typev.TYPEV);
    }

    /**
     * Create a detached, initialised TypevRecord
     */
    public TypevRecord(String name, Long typevPk) {
        super(Typev.TYPEV);

        set(0, name);
        set(1, typevPk);
    }
}
