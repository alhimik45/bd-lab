/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Examlist;


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
public class ExamlistRecord extends UpdatableRecordImpl<ExamlistRecord> implements Record6<String, Long, Long, Long, Long, Date> {

    private static final long serialVersionUID = -608273623;

    /**
     * Setter for <code>public.ExamList.Results</code>.
     */
    public void setResults(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ExamList.Results</code>.
     */
    public String getResults() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.ExamList.Person_PK</code>.
     */
    public void setPersonPk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ExamList.Person_PK</code>.
     */
    public Long getPersonPk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.ExamList.ExamList_PK</code>.
     */
    public void setExamlistPk(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ExamList.ExamList_PK</code>.
     */
    public Long getExamlistPk() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.ExamList.Employe_PK</code>.
     */
    public void setEmployePk(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ExamList.Employe_PK</code>.
     */
    public Long getEmployePk() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.ExamList.Person_PK1</code>.
     */
    public void setPersonPk1(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ExamList.Person_PK1</code>.
     */
    public Long getPersonPk1() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.ExamList.Date</code>.
     */
    public void setDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ExamList.Date</code>.
     */
    public Date getDate() {
        return (Date) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, Long, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, Long, Long, Long, Long, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Examlist.EXAMLIST.RESULTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Examlist.EXAMLIST.PERSON_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Examlist.EXAMLIST.EXAMLIST_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Examlist.EXAMLIST.EMPLOYE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Examlist.EXAMLIST.PERSON_PK1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Examlist.EXAMLIST.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getExamlistPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getPersonPk1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getResults();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPersonPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getExamlistPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getEmployePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getPersonPk1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value1(String value) {
        setResults(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value2(Long value) {
        setPersonPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value3(Long value) {
        setExamlistPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value4(Long value) {
        setEmployePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value5(Long value) {
        setPersonPk1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord value6(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExamlistRecord values(String value1, Long value2, Long value3, Long value4, Long value5, Date value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExamlistRecord
     */
    public ExamlistRecord() {
        super(Examlist.EXAMLIST);
    }

    /**
     * Create a detached, initialised ExamlistRecord
     */
    public ExamlistRecord(String results, Long personPk, Long examlistPk, Long employePk, Long personPk1, Date date) {
        super(Examlist.EXAMLIST);

        set(0, results);
        set(1, personPk);
        set(2, examlistPk);
        set(3, employePk);
        set(4, personPk1);
        set(5, date);
    }
}
