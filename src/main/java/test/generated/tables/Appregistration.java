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
import test.generated.tables.records.AppregistrationRecord;


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
public class Appregistration extends TableImpl<AppregistrationRecord> {

    private static final long serialVersionUID = 480146506;

    /**
     * The reference instance of <code>public.AppRegistration</code>
     */
    public static final Appregistration APPREGISTRATION = new Appregistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppregistrationRecord> getRecordType() {
        return AppregistrationRecord.class;
    }

    /**
     * The column <code>public.AppRegistration.Content</code>.
     */
    public final TableField<AppregistrationRecord, String> CONTENT = createField("Content", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>public.AppRegistration.Person_PK</code>.
     */
    public final TableField<AppregistrationRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.AppRegistration.Vehicle_PK</code>.
     */
    public final TableField<AppregistrationRecord, Long> VEHICLE_PK = createField("Vehicle_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.AppRegistration.AppRegistration_PK</code>.
     */
    public final TableField<AppregistrationRecord, Long> APPREGISTRATION_PK = createField("AppRegistration_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"AppRegistration_AppRegistration_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.AppRegistration.Employe_PK</code>.
     */
    public final TableField<AppregistrationRecord, Long> EMPLOYE_PK = createField("Employe_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.AppRegistration.Person_PK1</code>.
     */
    public final TableField<AppregistrationRecord, Long> PERSON_PK1 = createField("Person_PK1", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.AppRegistration.Date</code>.
     */
    public final TableField<AppregistrationRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.AppRegistration</code> table reference
     */
    public Appregistration() {
        this(DSL.name("AppRegistration"), null);
    }

    /**
     * Create an aliased <code>public.AppRegistration</code> table reference
     */
    public Appregistration(String alias) {
        this(DSL.name(alias), APPREGISTRATION);
    }

    /**
     * Create an aliased <code>public.AppRegistration</code> table reference
     */
    public Appregistration(Name alias) {
        this(alias, APPREGISTRATION);
    }

    private Appregistration(Name alias, Table<AppregistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Appregistration(Name alias, Table<AppregistrationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AppregistrationRecord, Long> getIdentity() {
        return Keys.IDENTITY_APPREGISTRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppregistrationRecord> getPrimaryKey() {
        return Keys.PK_APPREGISTRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppregistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<AppregistrationRecord>>asList(Keys.PK_APPREGISTRATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AppregistrationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AppregistrationRecord, ?>>asList(Keys.APPREGISTRATION__RELATIONSHIP20, Keys.APPREGISTRATION__RELATIONSHIP39, Keys.APPREGISTRATION__RELATIONSHIP22);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Appregistration as(String alias) {
        return new Appregistration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Appregistration as(Name alias) {
        return new Appregistration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Appregistration rename(String name) {
        return new Appregistration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Appregistration rename(Name name) {
        return new Appregistration(name, null);
    }
}