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
import test.generated.tables.records.ProtocolViewRecord;


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
public class ProtocolView extends TableImpl<ProtocolViewRecord> {

    private static final long serialVersionUID = 755663084;

    /**
     * The reference instance of <code>public.protocol_view</code>
     */
    public static final ProtocolView PROTOCOL_VIEW = new ProtocolView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProtocolViewRecord> getRecordType() {
        return ProtocolViewRecord.class;
    }

    /**
     * The column <code>public.protocol_view.FIO</code>.
     */
    public final TableField<ProtocolViewRecord, String> FIO = createField("FIO", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.protocol_view.PasportSeries</code>.
     */
    public final TableField<ProtocolViewRecord, String> PASPORTSERIES = createField("PasportSeries", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.protocol_view.PassportID</code>.
     */
    public final TableField<ProtocolViewRecord, String> PASSPORTID = createField("PassportID", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.protocol_view.ArticleCop</code>.
     */
    public final TableField<ProtocolViewRecord, String> ARTICLECOP = createField("ArticleCop", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.protocol_view.AddressVioalation</code>.
     */
    public final TableField<ProtocolViewRecord, String> ADDRESSVIOALATION = createField("AddressVioalation", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.protocol_view.Date</code>.
     */
    public final TableField<ProtocolViewRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.protocol_view.Person_PK</code>.
     */
    public final TableField<ProtocolViewRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.protocol_view.Protocol_PK</code>.
     */
    public final TableField<ProtocolViewRecord, Long> PROTOCOL_PK = createField("Protocol_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.protocol_view.Name</code>.
     */
    public final TableField<ProtocolViewRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.protocol_view</code> table reference
     */
    public ProtocolView() {
        this(DSL.name("protocol_view"), null);
    }

    /**
     * Create an aliased <code>public.protocol_view</code> table reference
     */
    public ProtocolView(String alias) {
        this(DSL.name(alias), PROTOCOL_VIEW);
    }

    /**
     * Create an aliased <code>public.protocol_view</code> table reference
     */
    public ProtocolView(Name alias) {
        this(alias, PROTOCOL_VIEW);
    }

    private ProtocolView(Name alias, Table<ProtocolViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProtocolView(Name alias, Table<ProtocolViewRecord> aliased, Field<?>[] parameters) {
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
    public ProtocolView as(String alias) {
        return new ProtocolView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProtocolView as(Name alias) {
        return new ProtocolView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProtocolView rename(String name) {
        return new ProtocolView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProtocolView rename(Name name) {
        return new ProtocolView(name, null);
    }
}
