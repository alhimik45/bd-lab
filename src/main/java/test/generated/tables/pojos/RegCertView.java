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
public class RegCertView implements Serializable {

    private static final long serialVersionUID = -1841826880;

    private Long   regcertPk;
    private Long   personPk;
    private Long   vehiclePk;
    private Long   employePk;
    private Date   begDate;
    private Date   endDate;
    private String content;
    private String brand;
    private String modelcar;
    private String licensePlate;
    private Long   personPk1;

    public RegCertView() {}

    public RegCertView(RegCertView value) {
        this.regcertPk = value.regcertPk;
        this.personPk = value.personPk;
        this.vehiclePk = value.vehiclePk;
        this.employePk = value.employePk;
        this.begDate = value.begDate;
        this.endDate = value.endDate;
        this.content = value.content;
        this.brand = value.brand;
        this.modelcar = value.modelcar;
        this.licensePlate = value.licensePlate;
        this.personPk1 = value.personPk1;
    }

    public RegCertView(
        Long   regcertPk,
        Long   personPk,
        Long   vehiclePk,
        Long   employePk,
        Date   begDate,
        Date   endDate,
        String content,
        String brand,
        String modelcar,
        String licensePlate,
        Long   personPk1
    ) {
        this.regcertPk = regcertPk;
        this.personPk = personPk;
        this.vehiclePk = vehiclePk;
        this.employePk = employePk;
        this.begDate = begDate;
        this.endDate = endDate;
        this.content = content;
        this.brand = brand;
        this.modelcar = modelcar;
        this.licensePlate = licensePlate;
        this.personPk1 = personPk1;
    }

    public Long getRegcertPk() {
        return this.regcertPk;
    }

    public void setRegcertPk(Long regcertPk) {
        this.regcertPk = regcertPk;
    }

    public Long getPersonPk() {
        return this.personPk;
    }

    public void setPersonPk(Long personPk) {
        this.personPk = personPk;
    }

    public Long getVehiclePk() {
        return this.vehiclePk;
    }

    public void setVehiclePk(Long vehiclePk) {
        this.vehiclePk = vehiclePk;
    }

    public Long getEmployePk() {
        return this.employePk;
    }

    public void setEmployePk(Long employePk) {
        this.employePk = employePk;
    }

    public Date getBegDate() {
        return this.begDate;
    }

    public void setBegDate(Date begDate) {
        this.begDate = begDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelcar() {
        return this.modelcar;
    }

    public void setModelcar(String modelcar) {
        this.modelcar = modelcar;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getPersonPk1() {
        return this.personPk1;
    }

    public void setPersonPk1(Long personPk1) {
        this.personPk1 = personPk1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegCertView (");

        sb.append(regcertPk);
        sb.append(", ").append(personPk);
        sb.append(", ").append(vehiclePk);
        sb.append(", ").append(employePk);
        sb.append(", ").append(begDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(content);
        sb.append(", ").append(brand);
        sb.append(", ").append(modelcar);
        sb.append(", ").append(licensePlate);
        sb.append(", ").append(personPk1);

        sb.append(")");
        return sb.toString();
    }
}
