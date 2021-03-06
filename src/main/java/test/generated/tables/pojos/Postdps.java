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
public class Postdps implements Serializable {

    private static final long serialVersionUID = 1620000470;

    private String  address;
    private Long    postdpsPk;
    private Boolean active;

    public Postdps() {}

    public Postdps(Postdps value) {
        this.address = value.address;
        this.postdpsPk = value.postdpsPk;
        this.active = value.active;
    }

    public Postdps(
        String  address,
        Long    postdpsPk,
        Boolean active
    ) {
        this.address = address;
        this.postdpsPk = postdpsPk;
        this.active = active;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPostdpsPk() {
        return this.postdpsPk;
    }

    public void setPostdpsPk(Long postdpsPk) {
        this.postdpsPk = postdpsPk;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Postdps (");

        sb.append(address);
        sb.append(", ").append(postdpsPk);
        sb.append(", ").append(active);

        sb.append(")");
        return sb.toString();
    }
}
