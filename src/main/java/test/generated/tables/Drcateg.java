/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import test.generated.tables.records.DrcategRecord;


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
public class Drcateg extends TableImpl<DrcategRecord> {

    private static final long serialVersionUID = 248402950;

    /**
     * The reference instance of <code>public.DrCateg</code>
     */
    public static final Drcateg DRCATEG = new Drcateg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DrcategRecord> getRecordType() {
        return DrcategRecord.class;
    }

    /**
     * The column <code>public.DrCateg.DrCateg_PK</code>.
     */
    public final TableField<DrcategRecord, Long> DRCATEG_PK = createField("DrCateg_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"DrCateg_DrCateg_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.DrCateg.DriverLicense_PK</code>.
     */
    public final TableField<DrcategRecord, Long> DRIVERLICENSE_PK = createField("DriverLicense_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.DrCateg.Category_PK</code>.
     */
    public final TableField<DrcategRecord, Long> CATEGORY_PK = createField("Category_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.DrCateg</code> table reference
     */
    public Drcateg() {
        this(DSL.name("DrCateg"), null);
    }

    /**
     * Create an aliased <code>public.DrCateg</code> table reference
     */
    public Drcateg(String alias) {
        this(DSL.name(alias), DRCATEG);
    }

    /**
     * Create an aliased <code>public.DrCateg</code> table reference
     */
    public Drcateg(Name alias) {
        this(alias, DRCATEG);
    }

    private Drcateg(Name alias, Table<DrcategRecord> aliased) {
        this(alias, aliased, null);
    }

    private Drcateg(Name alias, Table<DrcategRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DrcategRecord, Long> getIdentity() {
        return Keys.IDENTITY_DRCATEG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DrcategRecord> getPrimaryKey() {
        return Keys.DRCATEG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DrcategRecord>> getKeys() {
        return Arrays.<UniqueKey<DrcategRecord>>asList(Keys.DRCATEG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DrcategRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DrcategRecord, ?>>asList(Keys.DRCATEG__RELATIONSHIP45, Keys.DRCATEG__RELATIONSHIP46);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Drcateg as(String alias) {
        return new Drcateg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Drcateg as(Name alias) {
        return new Drcateg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Drcateg rename(String name) {
        return new Drcateg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Drcateg rename(Name name) {
        return new Drcateg(name, null);
    }
}
