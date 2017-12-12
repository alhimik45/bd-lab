/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class Distrorder implements Serializable {

    private static final long serialVersionUID = -1480907891;

    private Date dateorder;
    private Long distrorderPk;
    private Long employePk;
    private Long personPk;

    public Distrorder() {}

    public Distrorder(Distrorder value) {
        this.dateorder = value.dateorder;
        this.distrorderPk = value.distrorderPk;
        this.employePk = value.employePk;
        this.personPk = value.personPk;
    }

    public Distrorder(
        Date dateorder,
        Long distrorderPk,
        Long employePk,
        Long personPk
    ) {
        this.dateorder = dateorder;
        this.distrorderPk = distrorderPk;
        this.employePk = employePk;
        this.personPk = personPk;
    }

    public Date getDateorder() {
        return this.dateorder;
    }

    public void setDateorder(Date dateorder) {
        this.dateorder = dateorder;
    }

    public Long getDistrorderPk() {
        return this.distrorderPk;
    }

    public void setDistrorderPk(Long distrorderPk) {
        this.distrorderPk = distrorderPk;
    }

    public Long getEmployePk() {
        return this.employePk;
    }

    public void setEmployePk(Long employePk) {
        this.employePk = employePk;
    }

    public Long getPersonPk() {
        return this.personPk;
    }

    public void setPersonPk(Long personPk) {
        this.personPk = personPk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Distrorder (");

        sb.append(dateorder);
        sb.append(", ").append(distrorderPk);
        sb.append(", ").append(employePk);
        sb.append(", ").append(personPk);

        sb.append(")");
        return sb.toString();
    }
}
