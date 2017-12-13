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
import test.generated.tables.records.ExamViewRecord;


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
public class ExamView extends TableImpl<ExamViewRecord> {

    private static final long serialVersionUID = -395500079;

    /**
     * The reference instance of <code>public.exam_view</code>
     */
    public static final ExamView EXAM_VIEW = new ExamView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExamViewRecord> getRecordType() {
        return ExamViewRecord.class;
    }

    /**
     * The column <code>public.exam_view.Results</code>.
     */
    public final TableField<ExamViewRecord, String> RESULTS = createField("Results", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.exam_view.FIO</code>.
     */
    public final TableField<ExamViewRecord, String> FIO = createField("FIO", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.exam_view.Date</code>.
     */
    public final TableField<ExamViewRecord, Date> DATE = createField("Date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>public.exam_view.ExamList_PK</code>.
     */
    public final TableField<ExamViewRecord, Long> EXAMLIST_PK = createField("ExamList_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.exam_view.Person_PK</code>.
     */
    public final TableField<ExamViewRecord, Long> PERSON_PK = createField("Person_PK", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.exam_view</code> table reference
     */
    public ExamView() {
        this(DSL.name("exam_view"), null);
    }

    /**
     * Create an aliased <code>public.exam_view</code> table reference
     */
    public ExamView(String alias) {
        this(DSL.name(alias), EXAM_VIEW);
    }

    /**
     * Create an aliased <code>public.exam_view</code> table reference
     */
    public ExamView(Name alias) {
        this(alias, EXAM_VIEW);
    }

    private ExamView(Name alias, Table<ExamViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExamView(Name alias, Table<ExamViewRecord> aliased, Field<?>[] parameters) {
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
    public ExamView as(String alias) {
        return new ExamView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamView as(Name alias) {
        return new ExamView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExamView rename(String name) {
        return new ExamView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExamView rename(Name name) {
        return new ExamView(name, null);
    }
}