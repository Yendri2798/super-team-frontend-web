package cr.una.frontend.web.model.logic;

/**
 * @author Yendri
 */

public class Disease {
    private String name;

    public Disease(){

    }

    /**
     *
     * @param name
     */

    public Disease(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "name='" + name + '\'' +
                '}';
    }
}
