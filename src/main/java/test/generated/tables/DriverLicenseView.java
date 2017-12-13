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
import test.generated.tables.records.DriverLicenseViewRecord;


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
public class DriverLicenseView extends TableImpl<DriverLicenseViewRecord> {

    private static final long serialVersionUID = 2098475007;

    /**
     * The reference instance of <code>public.driver_license_view</code>
     */
    public static final DriverLicenseView DRIVER_LICENSE_VIEW = new DriverLicenseView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverLicenseViewRecord> getRecordType() {
        return DriverLicenseViewRecord.class;
    }

    /**
     * The column <code>public.driver_license_view.FIO</code>.
     */
    public final TableField<DriverLicenseViewRecord, String> FIO = createField("FIO", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.driver_license_view.LicenseID</code>.
     */
    public final TableField<DriverLicenseViewRecord, String> LICENSEID = createField("LicenseID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.driver_license_view.Cat</code>.
     */
    public final TableField<DriverLicenseViewRecord, String> CAT = createField("Cat", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.driver_license_view.DateOfIssue</code>.
     */
    public final TableField<DriverLicenseViewRecord, Date> DATEOFISSUE = createField("DateOfIssue", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.driver_license_view.Person_PK</code>.
     */
    public final TableField<DriverLicenseViewRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.driver_license_view</code> table reference
     */
    public DriverLicenseView() {
        this(DSL.name("driver_license_view"), null);
    }

    /**
     * Create an aliased <code>public.driver_license_view</code> table reference
     */
    public DriverLicenseView(String alias) {
        this(DSL.name(alias), DRIVER_LICENSE_VIEW);
    }

    /**
     * Create an aliased <code>public.driver_license_view</code> table reference
     */
    public DriverLicenseView(Name alias) {
        this(alias, DRIVER_LICENSE_VIEW);
    }

    private DriverLicenseView(Name alias, Table<DriverLicenseViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private DriverLicenseView(Name alias, Table<DriverLicenseViewRecord> aliased, Field<?>[] parameters) {
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
    public DriverLicenseView as(String alias) {
        return new DriverLicenseView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverLicenseView as(Name alias) {
        return new DriverLicenseView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverLicenseView rename(String name) {
        return new DriverLicenseView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverLicenseView rename(Name name) {
        return new DriverLicenseView(name, null);
    }
}