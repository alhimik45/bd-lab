/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import test.generated.Public;
import test.generated.tables.records.VehicleViewRecord;


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
public class VehicleView extends TableImpl<VehicleViewRecord> {

    private static final long serialVersionUID = -1680326205;

    /**
     * The reference instance of <code>public.vehicle_view</code>
     */
    public static final VehicleView VEHICLE_VIEW = new VehicleView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VehicleViewRecord> getRecordType() {
        return VehicleViewRecord.class;
    }

    /**
     * The column <code>public.vehicle_view.license_plate</code>.
     */
    public final TableField<VehicleViewRecord, String> LICENSE_PLATE = createField("license_plate", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.vehicle_view.ModelCar</code>.
     */
    public final TableField<VehicleViewRecord, String> MODELCAR = createField("ModelCar", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.vehicle_view.Brand</code>.
     */
    public final TableField<VehicleViewRecord, String> BRAND = createField("Brand", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.vehicle_view.fio</code>.
     */
    public final TableField<VehicleViewRecord, String> FIO = createField("fio", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.vehicle_view.status</code>.
     */
    public final TableField<VehicleViewRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.vehicle_view.beg_date</code>.
     */
    public final TableField<VehicleViewRecord, Date> BEG_DATE = createField("beg_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.vehicle_view.end_date</code>.
     */
    public final TableField<VehicleViewRecord, Date> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.vehicle_view.Vehicle_PK</code>.
     */
    public final TableField<VehicleViewRecord, Long> VEHICLE_PK = createField("Vehicle_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.vehicle_view.PTS_PK</code>.
     */
    public final TableField<VehicleViewRecord, Long> PTS_PK = createField("PTS_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.vehicle_view.LicensePlate_PK</code>.
     */
    public final TableField<VehicleViewRecord, Long> LICENSEPLATE_PK = createField("LicensePlate_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.vehicle_view</code> table reference
     */
    public VehicleView() {
        this(DSL.name("vehicle_view"), null);
    }

    /**
     * Create an aliased <code>public.vehicle_view</code> table reference
     */
    public VehicleView(String alias) {
        this(DSL.name(alias), VEHICLE_VIEW);
    }

    /**
     * Create an aliased <code>public.vehicle_view</code> table reference
     */
    public VehicleView(Name alias) {
        this(alias, VEHICLE_VIEW);
    }

    private VehicleView(Name alias, Table<VehicleViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private VehicleView(Name alias, Table<VehicleViewRecord> aliased, Field<?>[] parameters) {
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
    public VehicleView as(String alias) {
        return new VehicleView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VehicleView as(Name alias) {
        return new VehicleView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleView rename(String name) {
        return new VehicleView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleView rename(Name name) {
        return new VehicleView(name, null);
    }
}
