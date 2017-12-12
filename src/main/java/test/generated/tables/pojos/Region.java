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
public class Region implements Serializable {

    private static final long serialVersionUID = -909591639;

    private String  name;
    private Integer number;
    private Long    regionPk;

    public Region() {}

    public Region(Region value) {
        this.name = value.name;
        this.number = value.number;
        this.regionPk = value.regionPk;
    }

    public Region(
        String  name,
        Integer number,
        Long    regionPk
    ) {
        this.name = name;
        this.number = number;
        this.regionPk = regionPk;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getRegionPk() {
        return this.regionPk;
    }

    public void setRegionPk(Long regionPk) {
        this.regionPk = regionPk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Region (");

        sb.append(name);
        sb.append(", ").append(number);
        sb.append(", ").append(regionPk);

        sb.append(")");
        return sb.toString();
    }
}
