/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import test.generated.Public;
import test.generated.tables.records.LicensePlateViewRecord;


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
public class LicensePlateView extends TableImpl<LicensePlateViewRecord> {

    private static final long serialVersionUID = 1445741087;

    /**
     * The reference instance of <code>public.license_plate_view</code>
     */
    public static final LicensePlateView LICENSE_PLATE_VIEW = new LicensePlateView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicensePlateViewRecord> getRecordType() {
        return LicensePlateViewRecord.class;
    }

    /**
     * The column <code>public.license_plate_view.license_plate</code>.
     */
    public final TableField<LicensePlateViewRecord, String> LICENSE_PLATE = createField("license_plate", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.license_plate_view.LicensePlate_PK</code>.
     */
    public final TableField<LicensePlateViewRecord, Long> LICENSEPLATE_PK = createField("LicensePlate_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.license_plate_view</code> table reference
     */
    public LicensePlateView() {
        this(DSL.name("license_plate_view"), null);
    }

    /**
     * Create an aliased <code>public.license_plate_view</code> table reference
     */
    public LicensePlateView(String alias) {
        this(DSL.name(alias), LICENSE_PLATE_VIEW);
    }

    /**
     * Create an aliased <code>public.license_plate_view</code> table reference
     */
    public LicensePlateView(Name alias) {
        this(alias, LICENSE_PLATE_VIEW);
    }

    private LicensePlateView(Name alias, Table<LicensePlateViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private LicensePlateView(Name alias, Table<LicensePlateViewRecord> aliased, Field<?>[] parameters) {
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
    public LicensePlateView as(String alias) {
        return new LicensePlateView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicensePlateView as(Name alias) {
        return new LicensePlateView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LicensePlateView rename(String name) {
        return new LicensePlateView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LicensePlateView rename(Name name) {
        return new LicensePlateView(name, null);
    }
}