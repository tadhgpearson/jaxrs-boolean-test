package ie.tadhgpearson.jaxrsbooleans;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;

/**
 * Created by tpearson on 5/9/17.
 */
public class BooleanTestDTO {

    private boolean primitive;

    @NotNull @DefaultValue("false")
    private Boolean object;

    public boolean isPrimitive() {
        return primitive;
    }

    public void setPrimitive(boolean primitive) {
        this.primitive = primitive;
    }

    public Boolean getObject() {
        return object;
    }

    public void setObject(Boolean object) {
        this.object = object;
    }

    @Override public String toString() {
        return "BooleanTestDTO{" + "primitive=" + primitive + ", object=" + object + '}';
    }
}
