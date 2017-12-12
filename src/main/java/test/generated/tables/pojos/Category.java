/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Category implements Serializable {

    private static final long serialVersionUID = -1715724620;

    private Long   categoryPk;
    private String name;

    public Category() {}

    public Category(Category value) {
        this.categoryPk = value.categoryPk;
        this.name = value.name;
    }

    public Category(
        Long   categoryPk,
        String name
    ) {
        this.categoryPk = categoryPk;
        this.name = name;
    }

    public Long getCategoryPk() {
        return this.categoryPk;
    }

    public void setCategoryPk(Long categoryPk) {
        this.categoryPk = categoryPk;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(categoryPk);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}