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
public class Examcateg implements Serializable {

    private static final long serialVersionUID = -1204749691;

    private Long examcategPk;
    private Long categoryPk;
    private Long examlistPk;

    public Examcateg() {}

    public Examcateg(Examcateg value) {
        this.examcategPk = value.examcategPk;
        this.categoryPk = value.categoryPk;
        this.examlistPk = value.examlistPk;
    }

    public Examcateg(
        Long examcategPk,
        Long categoryPk,
        Long examlistPk
    ) {
        this.examcategPk = examcategPk;
        this.categoryPk = categoryPk;
        this.examlistPk = examlistPk;
    }

    public Long getExamcategPk() {
        return this.examcategPk;
    }

    public void setExamcategPk(Long examcategPk) {
        this.examcategPk = examcategPk;
    }

    public Long getCategoryPk() {
        return this.categoryPk;
    }

    public void setCategoryPk(Long categoryPk) {
        this.categoryPk = categoryPk;
    }

    public Long getExamlistPk() {
        return this.examlistPk;
    }

    public void setExamlistPk(Long examlistPk) {
        this.examlistPk = examlistPk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Examcateg (");

        sb.append(examcategPk);
        sb.append(", ").append(categoryPk);
        sb.append(", ").append(examlistPk);

        sb.append(")");
        return sb.toString();
    }
}
