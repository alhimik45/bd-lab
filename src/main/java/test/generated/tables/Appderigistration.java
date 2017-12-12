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
import test.generated.tables.records.AppderigistrationRecord;


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
public class Appderigistration extends TableImpl<AppderigistrationRecord> {

    private static final long serialVersionUID = 1788751643;

    /**
     * The reference instance of <code>public.AppDerigistration</code>
     */
    public static final Appderigistration APPDERIGISTRATION = new Appderigistration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppderigistrationRecord> getRecordType() {
        return AppderigistrationRecord.class;
    }

    /**
     * The column <code>public.AppDerigistration.Content</code>.
     */
    public final TableField<AppderigistrationRecord, String> CONTENT = createField("Content", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>public.AppDerigistration.Person_PK</code>.
     */
    public final TableField<AppderigistrationRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.AppDerigistration.RegCert_PK</code>.
     */
    public final TableField<AppderigistrationRecord, Long> REGCERT_PK = createField("RegCert_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.AppDerigistration.AppDerigistration_PK</code>.
     */
    public final TableField<AppderigistrationRecord, Long> APPDERIGISTRATION_PK = createField("AppDerigistration_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"AppDerigistration_AppDerigistration_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.AppDerigistration.Employe_PK</code>.
     */
    public final TableField<AppderigistrationRecord, Long> EMPLOYE_PK = createField("Employe_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.AppDerigistration.Person_PK1</code>.
     */
    public final TableField<AppderigistrationRecord, Long> PERSON_PK1 = createField("Person_PK1", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.AppDerigistration.Date</code>.
     */
    public final TableField<AppderigistrationRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.AppDerigistration</code> table reference
     */
    public Appderigistration() {
        this(DSL.name("AppDerigistration"), null);
    }

    /**
     * Create an aliased <code>public.AppDerigistration</code> table reference
     */
    public Appderigistration(String alias) {
        this(DSL.name(alias), APPDERIGISTRATION);
    }

    /**
     * Create an aliased <code>public.AppDerigistration</code> table reference
     */
    public Appderigistration(Name alias) {
        this(alias, APPDERIGISTRATION);
    }

    private Appderigistration(Name alias, Table<AppderigistrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Appderigistration(Name alias, Table<AppderigistrationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AppderigistrationRecord, Long> getIdentity() {
        return Keys.IDENTITY_APPDERIGISTRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppderigistrationRecord> getPrimaryKey() {
        return Keys.PK_APPDERIGISTRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppderigistrationRecord>> getKeys() {
        return Arrays.<UniqueKey<AppderigistrationRecord>>asList(Keys.PK_APPDERIGISTRATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AppderigistrationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AppderigistrationRecord, ?>>asList(Keys.APPDERIGISTRATION__RELATIONSHIP27, Keys.APPDERIGISTRATION__RELATIONSHIP38, Keys.APPDERIGISTRATION__RELATIONSHIP23);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Appderigistration as(String alias) {
        return new Appderigistration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Appderigistration as(Name alias) {
        return new Appderigistration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Appderigistration rename(String name) {
        return new Appderigistration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Appderigistration rename(Name name) {
        return new Appderigistration(name, null);
    }
}