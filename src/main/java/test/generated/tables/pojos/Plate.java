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
public class Plate implements Serializable {

    private static final long serialVersionUID = 165353238;

    private String number;
    private Long   platePk;

    public Plate() {}

    public Plate(Plate value) {
        this.number = value.number;
        this.platePk = value.platePk;
    }

    public Plate(
        String number,
        Long   platePk
    ) {
        this.number = number;
        this.platePk = platePk;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getPlatePk() {
        return this.platePk;
    }

    public void setPlatePk(Long platePk) {
        this.platePk = platePk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plate (");

        sb.append(number);
        sb.append(", ").append(platePk);

        sb.append(")");
        return sb.toString();
    }
}
