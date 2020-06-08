package cr.una.frontend.web.model.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yendri
 */

public class Id {
    @JsonProperty("$oid")
    private String $oid;

    public Id() {

    }

    /**
     * @param $oid
     */

    public Id(String $oid) {
        this.$oid = $oid;
    }

    public String get$oid() {
        return $oid;
    }

    public void set$oid(String $oid) {
        this.$oid = $oid;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id='" + $oid + '\'' +
                '}';
    }
}
