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
public class DriverLicenseView implements Serializable {

    private static final long serialVersionUID = 1165474434;

    private String fio;
    private String licenseid;
    private String cat;
    private Date   dateofissue;
    private Long   personPk;
    private Long   driverlicensePk;

    public DriverLicenseView() {}

    public DriverLicenseView(DriverLicenseView value) {
        this.fio = value.fio;
        this.licenseid = value.licenseid;
        this.cat = value.cat;
        this.dateofissue = value.dateofissue;
        this.personPk = value.personPk;
        this.driverlicensePk = value.driverlicensePk;
    }

    public DriverLicenseView(
        String fio,
        String licenseid,
        String cat,
        Date   dateofissue,
        Long   personPk,
        Long   driverlicensePk
    ) {
        this.fio = fio;
        this.licenseid = licenseid;
        this.cat = cat;
        this.dateofissue = dateofissue;
        this.personPk = personPk;
        this.driverlicensePk = driverlicensePk;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLicenseid() {
        return this.licenseid;
    }

    public void setLicenseid(String licenseid) {
        this.licenseid = licenseid;
    }

    public String getCat() {
        return this.cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Date getDateofissue() {
        return this.dateofissue;
    }

    public void setDateofissue(Date dateofissue) {
        this.dateofissue = dateofissue;
    }

    public Long getPersonPk() {
        return this.personPk;
    }

    public void setPersonPk(Long personPk) {
        this.personPk = personPk;
    }

    public Long getDriverlicensePk() {
        return this.driverlicensePk;
    }

    public void setDriverlicensePk(Long driverlicensePk) {
        this.driverlicensePk = driverlicensePk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DriverLicenseView (");

        sb.append(fio);
        sb.append(", ").append(licenseid);
        sb.append(", ").append(cat);
        sb.append(", ").append(dateofissue);
        sb.append(", ").append(personPk);
        sb.append(", ").append(driverlicensePk);

        sb.append(")");
        return sb.toString();
    }
}
