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
public class CurrentDistrView implements Serializable {

    private static final long serialVersionUID = 127487932;

    private Long   employePk;
    private Long   postdpsPk;
    private String fio;
    private String address;

    public CurrentDistrView() {}

    public CurrentDistrView(CurrentDistrView value) {
        this.employePk = value.employePk;
        this.postdpsPk = value.postdpsPk;
        this.fio = value.fio;
        this.address = value.address;
    }

    public CurrentDistrView(
        Long   employePk,
        Long   postdpsPk,
        String fio,
        String address
    ) {
        this.employePk = employePk;
        this.postdpsPk = postdpsPk;
        this.fio = fio;
        this.address = address;
    }

    public Long getEmployePk() {
        return this.employePk;
    }

    public void setEmployePk(Long employePk) {
        this.employePk = employePk;
    }

    public Long getPostdpsPk() {
        return this.postdpsPk;
    }

    public void setPostdpsPk(Long postdpsPk) {
        this.postdpsPk = postdpsPk;
    }

    public String getFio() {
        return this.fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CurrentDistrView (");

        sb.append(employePk);
        sb.append(", ").append(postdpsPk);
        sb.append(", ").append(fio);
        sb.append(", ").append(address);

        sb.append(")");
        return sb.toString();
    }
}
