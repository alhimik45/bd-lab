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
import test.generated.tables.records.EmployeViewRecord;


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
public class EmployeView extends TableImpl<EmployeViewRecord> {

    private static final long serialVersionUID = 1400296666;

    /**
     * The reference instance of <code>public.employe_view</code>
     */
    public static final EmployeView EMPLOYE_VIEW = new EmployeView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeViewRecord> getRecordType() {
        return EmployeViewRecord.class;
    }

    /**
     * The column <code>public.employe_view.FIO</code>.
     */
    public final TableField<EmployeViewRecord, String> FIO = createField("FIO", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.employe_view.PersonalID</code>.
     */
    public final TableField<EmployeViewRecord, String> PERSONALID = createField("PersonalID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.employe_view.Name</code>.
     */
    public final TableField<EmployeViewRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.employe_view.Person_PK</code>.
     */
    public final TableField<EmployeViewRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.employe_view.Employe_PK</code>.
     */
    public final TableField<EmployeViewRecord, Long> EMPLOYE_PK = createField("Employe_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.employe_view.Login</code>.
     */
    public final TableField<EmployeViewRecord, String> LOGIN = createField("Login", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * Create a <code>public.employe_view</code> table reference
     */
    public EmployeView() {
        this(DSL.name("employe_view"), null);
    }

    /**
     * Create an aliased <code>public.employe_view</code> table reference
     */
    public EmployeView(String alias) {
        this(DSL.name(alias), EMPLOYE_VIEW);
    }

    /**
     * Create an aliased <code>public.employe_view</code> table reference
     */
    public EmployeView(Name alias) {
        this(alias, EMPLOYE_VIEW);
    }

    private EmployeView(Name alias, Table<EmployeViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployeView(Name alias, Table<EmployeViewRecord> aliased, Field<?>[] parameters) {
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
    public EmployeView as(String alias) {
        return new EmployeView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeView as(Name alias) {
        return new EmployeView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployeView rename(String name) {
        return new EmployeView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployeView rename(Name name) {
        return new EmployeView(name, null);
    }
}
