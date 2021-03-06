/*
 * This file is generated by jOOQ.
*/
package test.generated.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;

import test.generated.Public;


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
public class GetCertStatus extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 499642444;

    /**
     * The parameter <code>public.get_cert_status.vid</code>.
     */
    public static final Parameter<Long> VID = createParameter("vid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public GetCertStatus() {
        super("get_cert_status", Public.PUBLIC);

        addInParameter(VID);
    }

    /**
     * Set the <code>vid</code> parameter IN value to the routine
     */
    public void setVid(Long value) {
        setValue(VID, value);
    }
}
