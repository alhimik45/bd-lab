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
public class Typedecision implements Serializable {

    private static final long serialVersionUID = -1361276384;

    private String name;
    private Long   typedecisionPk;

    public Typedecision() {}

    public Typedecision(Typedecision value) {
        this.name = value.name;
        this.typedecisionPk = value.typedecisionPk;
    }

    public Typedecision(
        String name,
        Long   typedecisionPk
    ) {
        this.name = name;
        this.typedecisionPk = typedecisionPk;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypedecisionPk() {
        return this.typedecisionPk;
    }

    public void setTypedecisionPk(Long typedecisionPk) {
        this.typedecisionPk = typedecisionPk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Typedecision (");

        sb.append(name);
        sb.append(", ").append(typedecisionPk);

        sb.append(")");
        return sb.toString();
    }
}
