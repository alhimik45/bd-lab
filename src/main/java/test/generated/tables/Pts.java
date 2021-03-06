/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Date;
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
import test.generated.tables.records.PtsRecord;


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
public class Pts extends TableImpl<PtsRecord> {

    private static final long serialVersionUID = -1437909119;

    /**
     * The reference instance of <code>public.PTS</code>
     */
    public static final Pts PTS = new Pts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PtsRecord> getRecordType() {
        return PtsRecord.class;
    }

    /**
     * The column <code>public.PTS.VIN</code>.
     */
    public final TableField<PtsRecord, String> VIN = createField("VIN", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.Brand</code>.
     */
    public final TableField<PtsRecord, String> BRAND = createField("Brand", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.ModelCar</code>.
     */
    public final TableField<PtsRecord, String> MODELCAR = createField("ModelCar", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.BodyColor</code>.
     */
    public final TableField<PtsRecord, String> BODYCOLOR = createField("BodyColor", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.YearOfMan</code>.
     */
    public final TableField<PtsRecord, Integer> YEAROFMAN = createField("YearOfMan", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.PTS.ModelEngine</code>.
     */
    public final TableField<PtsRecord, String> MODELENGINE = createField("ModelEngine", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.EngineID</code>.
     */
    public final TableField<PtsRecord, String> ENGINEID = createField("EngineID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.СhassisID</code>.
     */
    public final TableField<PtsRecord, String> СHASSISID = createField("СhassisID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.BodyID</code>.
     */
    public final TableField<PtsRecord, String> BODYID = createField("BodyID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.PTS.Power</code>.
     */
    public final TableField<PtsRecord, Integer> POWER = createField("Power", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.PTS.WorkCapacity</code>.
     */
    public final TableField<PtsRecord, Integer> WORKCAPACITY = createField("WorkCapacity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.PTS.UnloadWeight</code>.
     */
    public final TableField<PtsRecord, Integer> UNLOADWEIGHT = createField("UnloadWeight", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.PTS.MaxWeight</code>.
     */
    public final TableField<PtsRecord, Integer> MAXWEIGHT = createField("MaxWeight", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.PTS.Vehicle_PK</code>.
     */
    public final TableField<PtsRecord, Long> VEHICLE_PK = createField("Vehicle_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.PTS.PTS_PK</code>.
     */
    public final TableField<PtsRecord, Long> PTS_PK = createField("PTS_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"PTS_PTS_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.PTS.EngineType_PK</code>.
     */
    public final TableField<PtsRecord, Long> ENGINETYPE_PK = createField("EngineType_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.PTS.TypeV_PK</code>.
     */
    public final TableField<PtsRecord, Long> TYPEV_PK = createField("TypeV_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.PTS.Category_PK</code>.
     */
    public final TableField<PtsRecord, Long> CATEGORY_PK = createField("Category_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.PTS.Date</code>.
     */
    public final TableField<PtsRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.PTS</code> table reference
     */
    public Pts() {
        this(DSL.name("PTS"), null);
    }

    /**
     * Create an aliased <code>public.PTS</code> table reference
     */
    public Pts(String alias) {
        this(DSL.name(alias), PTS);
    }

    /**
     * Create an aliased <code>public.PTS</code> table reference
     */
    public Pts(Name alias) {
        this(alias, PTS);
    }

    private Pts(Name alias, Table<PtsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pts(Name alias, Table<PtsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PtsRecord, Long> getIdentity() {
        return Keys.IDENTITY_PTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PtsRecord> getPrimaryKey() {
        return Keys.PK_PTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PtsRecord>> getKeys() {
        return Arrays.<UniqueKey<PtsRecord>>asList(Keys.PK_PTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PtsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PtsRecord, ?>>asList(Keys.PTS__RELATIONSHIP32, Keys.PTS__RELATIONSHIP31, Keys.PTS__RELATIONSHIP30, Keys.PTS__RELATIONSHIP49);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pts as(String alias) {
        return new Pts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pts as(Name alias) {
        return new Pts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pts rename(String name) {
        return new Pts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pts rename(Name name) {
        return new Pts(name, null);
    }
}
