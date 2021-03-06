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
import test.generated.tables.records.PlateRecord;


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
public class Plate extends TableImpl<PlateRecord> {

    private static final long serialVersionUID = 1885312986;

    /**
     * The reference instance of <code>public.Plate</code>
     */
    public static final Plate PLATE = new Plate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlateRecord> getRecordType() {
        return PlateRecord.class;
    }

    /**
     * The column <code>public.Plate.Number</code>.
     */
    public final TableField<PlateRecord, String> NUMBER = createField("Number", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.Plate.Plate_PK</code>.
     */
    public final TableField<PlateRecord, Long> PLATE_PK = createField("Plate_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"Plate_Plate_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.Plate</code> table reference
     */
    public Plate() {
        this(DSL.name("Plate"), null);
    }

    /**
     * Create an aliased <code>public.Plate</code> table reference
     */
    public Plate(String alias) {
        this(DSL.name(alias), PLATE);
    }

    /**
     * Create an aliased <code>public.Plate</code> table reference
     */
    public Plate(Name alias) {
        this(alias, PLATE);
    }

    private Plate(Name alias, Table<PlateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plate(Name alias, Table<PlateRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PlateRecord, Long> getIdentity() {
        return Keys.IDENTITY_PLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlateRecord> getPrimaryKey() {
        return Keys.UNIQUE_IDENTIFIER1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlateRecord>> getKeys() {
        return Arrays.<UniqueKey<PlateRecord>>asList(Keys.UNIQUE_IDENTIFIER1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plate as(String alias) {
        return new Plate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plate as(Name alias) {
        return new Plate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plate rename(String name) {
        return new Plate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plate rename(Name name) {
        return new Plate(name, null);
    }
}
