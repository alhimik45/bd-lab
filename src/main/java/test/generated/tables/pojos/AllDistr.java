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
public class AllDistr implements Serializable {

    private static final long serialVersionUID = -1411535549;

    private String fio;
    private String personalid;
    private String address;
    private Date   dateorder;
    private Long   assignmentPk;

    public AllDistr() {}

    public AllDistr(AllDistr value) {
        this.fio = value.fio;
        this.personalid = value.personalid;
        this.address = value.address;
        this.dateorder = value.dateorder;
        this.assignmentPk = value.assignmentPk;
    }

    public AllDistr(
        String fio,
        String personalid,
        String address,
        Date   dateorder,
        Long   assignmentPk
    ) {
        this.fio = fio;
        this.personalid = personalid;
        this.address = address;
        this.dateorder = dateorder;
        this.assignmentPk = assignmentPk;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPersonalid() {
        return this.personalid;
    }

    public void setPersonalid(String personalid) {
        this.personalid = personalid;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateorder() {
        return this.dateorder;
    }

    public void setDateorder(Date dateorder) {
        this.dateorder = dateorder;
    }

    public Long getAssignmentPk() {
        return this.assignmentPk;
    }

    public void setAssignmentPk(Long assignmentPk) {
        this.assignmentPk = assignmentPk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AllDistr (");

        sb.append(fio);
        sb.append(", ").append(personalid);
        sb.append(", ").append(address);
        sb.append(", ").append(dateorder);
        sb.append(", ").append(assignmentPk);

        sb.append(")");
        return sb.toString();
    }
}
