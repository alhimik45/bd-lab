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
import test.generated.tables.records.EnginetypeRecord;


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
public class Enginetype extends TableImpl<EnginetypeRecord> {

    private static final long serialVersionUID = -503812901;

    /**
     * The reference instance of <code>public.EngineType</code>
     */
    public static final Enginetype ENGINETYPE = new Enginetype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnginetypeRecord> getRecordType() {
        return EnginetypeRecord.class;
    }

    /**
     * The column <code>public.EngineType.Name</code>.
     */
    public final TableField<EnginetypeRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.EngineType.EngineType_PK</code>.
     */
    public final TableField<EnginetypeRecord, Long> ENGINETYPE_PK = createField("EngineType_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"EngineType_EngineType_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.EngineType</code> table reference
     */
    public Enginetype() {
        this(DSL.name("EngineType"), null);
    }

    /**
     * Create an aliased <code>public.EngineType</code> table reference
     */
    public Enginetype(String alias) {
        this(DSL.name(alias), ENGINETYPE);
    }

    /**
     * Create an aliased <code>public.EngineType</code> table reference
     */
    public Enginetype(Name alias) {
        this(alias, ENGINETYPE);
    }

    private Enginetype(Name alias, Table<EnginetypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Enginetype(Name alias, Table<EnginetypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EnginetypeRecord, Long> getIdentity() {
        return Keys.IDENTITY_ENGINETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnginetypeRecord> getPrimaryKey() {
        return Keys.PK_ENGINETYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnginetypeRecord>> getKeys() {
        return Arrays.<UniqueKey<EnginetypeRecord>>asList(Keys.PK_ENGINETYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enginetype as(String alias) {
        return new Enginetype(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Enginetype as(Name alias) {
        return new Enginetype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Enginetype rename(String name) {
        return new Enginetype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Enginetype rename(Name name) {
        return new Enginetype(name, null);
    }
}
