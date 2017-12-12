/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Date;
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
import test.generated.tables.records.PersonRecord;


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
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 2143747329;

    /**
     * The reference instance of <code>public.Person</code>
     */
    public static final Person PERSON = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>public.Person.FIO</code>.
     */
    public final TableField<PersonRecord, String> FIO = createField("FIO", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.Person.PassportID</code>.
     */
    public final TableField<PersonRecord, String> PASSPORTID = createField("PassportID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.Person.PasportSeries</code>.
     */
    public final TableField<PersonRecord, String> PASPORTSERIES = createField("PasportSeries", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.Person.DayBirth</code>.
     */
    public final TableField<PersonRecord, Date> DAYBIRTH = createField("DayBirth", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.Person.HomeAddress</code>.
     */
    public final TableField<PersonRecord, String> HOMEADDRESS = createField("HomeAddress", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.Person.Person_PK</code>.
     */
    public final TableField<PersonRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"Person_Person_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.Person</code> table reference
     */
    public Person() {
        this(DSL.name("Person"), null);
    }

    /**
     * Create an aliased <code>public.Person</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON);
    }

    /**
     * Create an aliased <code>public.Person</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON);
    }

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PersonRecord, Long> getIdentity() {
        return Keys.IDENTITY_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.PK_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PersonRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonRecord>>asList(Keys.PK_PERSON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }
}