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
import test.generated.tables.records.ProtocoldecisionRecord;


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
public class Protocoldecision extends TableImpl<ProtocoldecisionRecord> {

    private static final long serialVersionUID = -198606848;

    /**
     * The reference instance of <code>public.ProtocolDecision</code>
     */
    public static final Protocoldecision PROTOCOLDECISION = new Protocoldecision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProtocoldecisionRecord> getRecordType() {
        return ProtocoldecisionRecord.class;
    }

    /**
     * The column <code>public.ProtocolDecision.Content</code>.
     */
    public final TableField<ProtocoldecisionRecord, String> CONTENT = createField("Content", org.jooq.impl.SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>public.ProtocolDecision.ProtocolDecision_PK</code>.
     */
    public final TableField<ProtocoldecisionRecord, Long> PROTOCOLDECISION_PK = createField("ProtocolDecision_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"ProtocolDecision_ProtocolDecision_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.ProtocolDecision.TypeDecision_PK</code>.
     */
    public final TableField<ProtocoldecisionRecord, Long> TYPEDECISION_PK = createField("TypeDecision_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ProtocolDecision.Protocol_PK</code>.
     */
    public final TableField<ProtocoldecisionRecord, Long> PROTOCOL_PK = createField("Protocol_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.ProtocolDecision.Employe_PK</code>.
     */
    public final TableField<ProtocoldecisionRecord, Long> EMPLOYE_PK = createField("Employe_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ProtocolDecision.Person_PK</code>.
     */
    public final TableField<ProtocoldecisionRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ProtocolDecision.Date</code>.
     */
    public final TableField<ProtocoldecisionRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.ProtocolDecision</code> table reference
     */
    public Protocoldecision() {
        this(DSL.name("ProtocolDecision"), null);
    }

    /**
     * Create an aliased <code>public.ProtocolDecision</code> table reference
     */
    public Protocoldecision(String alias) {
        this(DSL.name(alias), PROTOCOLDECISION);
    }

    /**
     * Create an aliased <code>public.ProtocolDecision</code> table reference
     */
    public Protocoldecision(Name alias) {
        this(alias, PROTOCOLDECISION);
    }

    private Protocoldecision(Name alias, Table<ProtocoldecisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Protocoldecision(Name alias, Table<ProtocoldecisionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ProtocoldecisionRecord, Long> getIdentity() {
        return Keys.IDENTITY_PROTOCOLDECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProtocoldecisionRecord> getPrimaryKey() {
        return Keys.PK_PROTOCOLDECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProtocoldecisionRecord>> getKeys() {
        return Arrays.<UniqueKey<ProtocoldecisionRecord>>asList(Keys.PK_PROTOCOLDECISION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProtocoldecisionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProtocoldecisionRecord, ?>>asList(Keys.PROTOCOLDECISION__RELATIONSHIP12, Keys.PROTOCOLDECISION__RELATIONSHIP11, Keys.PROTOCOLDECISION__RELATIONSHIP40);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Protocoldecision as(String alias) {
        return new Protocoldecision(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Protocoldecision as(Name alias) {
        return new Protocoldecision(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Protocoldecision rename(String name) {
        return new Protocoldecision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Protocoldecision rename(Name name) {
        return new Protocoldecision(name, null);
    }
}
