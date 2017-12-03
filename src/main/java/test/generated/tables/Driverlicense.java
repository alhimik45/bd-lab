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
import test.generated.tables.records.DriverlicenseRecord;


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
public class Driverlicense extends TableImpl<DriverlicenseRecord> {

    private static final long serialVersionUID = -1577810385;

    /**
     * The reference instance of <code>public.DriverLicense</code>
     */
    public static final Driverlicense DRIVERLICENSE = new Driverlicense();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverlicenseRecord> getRecordType() {
        return DriverlicenseRecord.class;
    }

    /**
     * The column <code>public.DriverLicense.Category</code>.
     */
    public final TableField<DriverlicenseRecord, String> CATEGORY = createField("Category", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.DriverLicense.DateOfIssue</code>.
     */
    public final TableField<DriverlicenseRecord, Date> DATEOFISSUE = createField("DateOfIssue", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.DriverLicense.Person_PK1</code>.
     */
    public final TableField<DriverlicenseRecord, Long> PERSON_PK1 = createField("Person_PK1", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.DriverLicense.DriverLicense_PK</code>.
     */
    public final TableField<DriverlicenseRecord, Long> DRIVERLICENSE_PK = createField("DriverLicense_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"DriverLicense_DriverLicense_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.DriverLicense.Employe_PK</code>.
     */
    public final TableField<DriverlicenseRecord, Long> EMPLOYE_PK = createField("Employe_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.DriverLicense.Person_PK</code>.
     */
    public final TableField<DriverlicenseRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.DriverLicense</code> table reference
     */
    public Driverlicense() {
        this(DSL.name("DriverLicense"), null);
    }

    /**
     * Create an aliased <code>public.DriverLicense</code> table reference
     */
    public Driverlicense(String alias) {
        this(DSL.name(alias), DRIVERLICENSE);
    }

    /**
     * Create an aliased <code>public.DriverLicense</code> table reference
     */
    public Driverlicense(Name alias) {
        this(alias, DRIVERLICENSE);
    }

    private Driverlicense(Name alias, Table<DriverlicenseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Driverlicense(Name alias, Table<DriverlicenseRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DriverlicenseRecord, Long> getIdentity() {
        return Keys.IDENTITY_DRIVERLICENSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DriverlicenseRecord> getPrimaryKey() {
        return Keys.ПК_DRIVERLICENSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DriverlicenseRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverlicenseRecord>>asList(Keys.ПК_DRIVERLICENSE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DriverlicenseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DriverlicenseRecord, ?>>asList(Keys.DRIVERLICENSE__RELATIONSHIP17, Keys.DRIVERLICENSE__RELATIONSHIP42);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Driverlicense as(String alias) {
        return new Driverlicense(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Driverlicense as(Name alias) {
        return new Driverlicense(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Driverlicense rename(String name) {
        return new Driverlicense(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Driverlicense rename(Name name) {
        return new Driverlicense(name, null);
    }
}
