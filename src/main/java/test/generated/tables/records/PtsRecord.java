/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;

import test.generated.tables.Pts;


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
public class PtsRecord extends UpdatableRecordImpl<PtsRecord> implements Record19<String, String, String, String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Long, Long, Long, Long, Long, Date> {

    private static final long serialVersionUID = -1017618857;

    /**
     * Setter for <code>public.PTS.VIN</code>.
     */
    public void setVin(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.PTS.VIN</code>.
     */
    public String getVin() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.PTS.Brand</code>.
     */
    public void setBrand(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.PTS.Brand</code>.
     */
    public String getBrand() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.PTS.ModelCar</code>.
     */
    public void setModelcar(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.PTS.ModelCar</code>.
     */
    public String getModelcar() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.PTS.BodyColor</code>.
     */
    public void setBodycolor(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.PTS.BodyColor</code>.
     */
    public String getBodycolor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.PTS.YearOfMan</code>.
     */
    public void setYearofman(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.PTS.YearOfMan</code>.
     */
    public Integer getYearofman() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.PTS.ModelEngine</code>.
     */
    public void setModelengine(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.PTS.ModelEngine</code>.
     */
    public String getModelengine() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.PTS.EngineID</code>.
     */
    public void setEngineid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.PTS.EngineID</code>.
     */
    public String getEngineid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.PTS.СhassisID</code>.
     */
    public void setСhassisid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.PTS.СhassisID</code>.
     */
    public String getСhassisid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.PTS.BodyID</code>.
     */
    public void setBodyid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.PTS.BodyID</code>.
     */
    public String getBodyid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.PTS.Power</code>.
     */
    public void setPower(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.PTS.Power</code>.
     */
    public Integer getPower() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.PTS.WorkCapacity</code>.
     */
    public void setWorkcapacity(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.PTS.WorkCapacity</code>.
     */
    public Integer getWorkcapacity() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.PTS.UnloadWeight</code>.
     */
    public void setUnloadweight(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.PTS.UnloadWeight</code>.
     */
    public Integer getUnloadweight() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.PTS.MaxWeight</code>.
     */
    public void setMaxweight(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.PTS.MaxWeight</code>.
     */
    public Integer getMaxweight() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.PTS.Vehicle_PK</code>.
     */
    public void setVehiclePk(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.PTS.Vehicle_PK</code>.
     */
    public Long getVehiclePk() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>public.PTS.PTS_PK</code>.
     */
    public void setPtsPk(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.PTS.PTS_PK</code>.
     */
    public Long getPtsPk() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>public.PTS.EngineType_PK</code>.
     */
    public void setEnginetypePk(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.PTS.EngineType_PK</code>.
     */
    public Long getEnginetypePk() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>public.PTS.TypeV_PK</code>.
     */
    public void setTypevPk(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.PTS.TypeV_PK</code>.
     */
    public Long getTypevPk() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>public.PTS.Category_PK</code>.
     */
    public void setCategoryPk(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.PTS.Category_PK</code>.
     */
    public Long getCategoryPk() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>public.PTS.Date</code>.
     */
    public void setDate(Date value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.PTS.Date</code>.
     */
    public Date getDate() {
        return (Date) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Long, Long, Long, Long, Long, Date> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, Integer, String, String, String, String, Integer, Integer, Integer, Integer, Long, Long, Long, Long, Long, Date> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Pts.PTS.VIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Pts.PTS.BRAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Pts.PTS.MODELCAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Pts.PTS.BODYCOLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Pts.PTS.YEAROFMAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Pts.PTS.MODELENGINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Pts.PTS.ENGINEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Pts.PTS.СHASSISID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Pts.PTS.BODYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Pts.PTS.POWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Pts.PTS.WORKCAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Pts.PTS.UNLOADWEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Pts.PTS.MAXWEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return Pts.PTS.VEHICLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return Pts.PTS.PTS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return Pts.PTS.ENGINETYPE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return Pts.PTS.TYPEV_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return Pts.PTS.CATEGORY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field19() {
        return Pts.PTS.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getVin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getBrand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getModelcar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBodycolor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getYearofman();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getModelengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getEngineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getСhassisid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBodyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getPower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getWorkcapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getUnloadweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getMaxweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component15() {
        return getPtsPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component16() {
        return getEnginetypePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component17() {
        return getTypevPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component18() {
        return getCategoryPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component19() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getVin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBrand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModelcar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBodycolor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getYearofman();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModelengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEngineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getСhassisid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBodyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getWorkcapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUnloadweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getMaxweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getVehiclePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getPtsPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getEnginetypePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getTypevPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getCategoryPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value19() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value1(String value) {
        setVin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value2(String value) {
        setBrand(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value3(String value) {
        setModelcar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value4(String value) {
        setBodycolor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value5(Integer value) {
        setYearofman(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value6(String value) {
        setModelengine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value7(String value) {
        setEngineid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value8(String value) {
        setСhassisid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value9(String value) {
        setBodyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value10(Integer value) {
        setPower(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value11(Integer value) {
        setWorkcapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value12(Integer value) {
        setUnloadweight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value13(Integer value) {
        setMaxweight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value14(Long value) {
        setVehiclePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value15(Long value) {
        setPtsPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value16(Long value) {
        setEnginetypePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value17(Long value) {
        setTypevPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value18(Long value) {
        setCategoryPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord value19(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PtsRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, Integer value10, Integer value11, Integer value12, Integer value13, Long value14, Long value15, Long value16, Long value17, Long value18, Date value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PtsRecord
     */
    public PtsRecord() {
        super(Pts.PTS);
    }

    /**
     * Create a detached, initialised PtsRecord
     */
    public PtsRecord(String vin, String brand, String modelcar, String bodycolor, Integer yearofman, String modelengine, String engineid, String сhassisid, String bodyid, Integer power, Integer workcapacity, Integer unloadweight, Integer maxweight, Long vehiclePk, Long ptsPk, Long enginetypePk, Long typevPk, Long categoryPk, Date date) {
        super(Pts.PTS);

        set(0, vin);
        set(1, brand);
        set(2, modelcar);
        set(3, bodycolor);
        set(4, yearofman);
        set(5, modelengine);
        set(6, engineid);
        set(7, сhassisid);
        set(8, bodyid);
        set(9, power);
        set(10, workcapacity);
        set(11, unloadweight);
        set(12, maxweight);
        set(13, vehiclePk);
        set(14, ptsPk);
        set(15, enginetypePk);
        set(16, typevPk);
        set(17, categoryPk);
        set(18, date);
    }
}