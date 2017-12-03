/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


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
import test.generated.tables.records.CategoryRecord;


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
public class Category extends TableImpl<CategoryRecord> {

    private static final long serialVersionUID = 1419462757;

    /**
     * The reference instance of <code>public.Category</code>
     */
    public static final Category CATEGORY = new Category();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryRecord> getRecordType() {
        return CategoryRecord.class;
    }

    /**
     * The column <code>public.Category.Category_PK</code>.
     */
    public final TableField<CategoryRecord, Long> CATEGORY_PK = createField("Category_PK", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('\"Category_Category_PK_seq\"'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.Category.Name</code>.
     */
    public final TableField<CategoryRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * Create a <code>public.Category</code> table reference
     */
    public Category() {
        this(DSL.name("Category"), null);
    }

    /**
     * Create an aliased <code>public.Category</code> table reference
     */
    public Category(String alias) {
        this(DSL.name(alias), CATEGORY);
    }

    /**
     * Create an aliased <code>public.Category</code> table reference
     */
    public Category(Name alias) {
        this(alias, CATEGORY);
    }

    private Category(Name alias, Table<CategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Category(Name alias, Table<CategoryRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CategoryRecord, Long> getIdentity() {
        return Keys.IDENTITY_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CategoryRecord> getPrimaryKey() {
        return Keys.CATEGORY_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryRecord>>asList(Keys.CATEGORY_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category as(String alias) {
        return new Category(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category as(Name alias) {
        return new Category(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(String name) {
        return new Category(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Category rename(Name name) {
        return new Category(name, null);
    }
}
