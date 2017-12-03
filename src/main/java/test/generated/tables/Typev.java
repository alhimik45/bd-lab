/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import test.generated.Keys;
import test.generated.Public;
import test.generated.tables.records.TypevRecord;


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
public class Typev extends TableImpl<TypevRecord> {

    private static final long serialVersionUID = -385182733;

    /**
     * The reference instance of <code>public.TypeV</code>
     */
    public static final Typev TYPEV = new Typev();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypevRecord> getRecordType() {
        return TypevRecord.class;
    }

    /**
     * The column <code>public.TypeV.Name</code>.
     */
    public final TableField<TypevRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.TypeV.TypeV_PK</code>.
     */
    public final TableField<TypevRecord, Long> TYPEV_PK = createField("TypeV_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"TypeV_TypeV_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.TypeV</code> table reference
     */
    public Typev() {
        this(DSL.name("TypeV"), null);
    }

    /**
     * Create an aliased <code>public.TypeV</code> table reference
     */
    public Typev(String alias) {
        this(DSL.name(alias), TYPEV);
    }

    /**
     * Create an aliased <code>public.TypeV</code> table reference
     */
    public Typev(Name alias) {
        this(alias, TYPEV);
    }

    private Typev(Name alias, Table<TypevRecord> aliased) {
        this(alias, aliased, null);
    }

    private Typev(Name alias, Table<TypevRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TypevRecord, Long> getIdentity() {
        return Keys.IDENTITY_TYPEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TypevRecord> getPrimaryKey() {
        return Keys.PK_TYPEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TypevRecord>> getKeys() {
        return Arrays.<UniqueKey<TypevRecord>>asList(Keys.PK_TYPEV);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Typev as(String alias) {
        return new Typev(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Typev as(Name alias) {
        return new Typev(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Typev rename(String name) {
        return new Typev(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Typev rename(Name name) {
        return new Typev(name, null);
    }
}
