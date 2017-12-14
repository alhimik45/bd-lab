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
public class VehicleView implements Serializable {

    private static final long serialVersionUID = -435469317;

    private String licensePlate;
    private String modelcar;
    private String brand;
    private String fio;
    private String status;
    private Date   begDate;
    private Date   endDate;
    private Long   vehiclePk;

    public VehicleView() {}

    public VehicleView(VehicleView value) {
        this.licensePlate = value.licensePlate;
        this.modelcar = value.modelcar;
        this.brand = value.brand;
        this.fio = value.fio;
        this.status = value.status;
        this.begDate = value.begDate;
        this.endDate = value.endDate;
        this.vehiclePk = value.vehiclePk;
    }

    public VehicleView(
        String licensePlate,
        String modelcar,
        String brand,
        String fio,
        String status,
        Date   begDate,
        Date   endDate,
        Long   vehiclePk
    ) {
        this.licensePlate = licensePlate;
        this.modelcar = modelcar;
        this.brand = brand;
        this.fio = fio;
        this.status = status;
        this.begDate = begDate;
        this.endDate = endDate;
        this.vehiclePk = vehiclePk;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModelcar() {
        return this.modelcar;
    }

    public void setModelcar(String modelcar) {
        this.modelcar = modelcar;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getVehiclePk() {
        return this.vehiclePk;
    }

    public void setVehiclePk(Long vehiclePk) {
        this.vehiclePk = vehiclePk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VehicleView (");

        sb.append(licensePlate);
        sb.append(", ").append(modelcar);
        sb.append(", ").append(brand);
        sb.append(", ").append(fio);
        sb.append(", ").append(status);
        sb.append(", ").append(begDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(vehiclePk);

        sb.append(")");
        return sb.toString();
    }
}
