package cr.una.frontend.web.model.logic;

/*
@author Yendri
 */

public class Consultorio {
    private int idConsultorio = 0;
    private String name;
    private String schedule;
    private String phone;
    private String address;

    public Consultorio() {
        this.name = "";
        this.schedule = "";
        this.phone = "";
        this.address = "";
    }

    /**
     * @param name
     * @param schedule
     * @param phone
     * @param address
     */

    public Consultorio(String name, String schedule, String phone, String address) {
        this.name = name;
        this.schedule = schedule;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    @Override
    public String toString() {
        return "Consultorio{" +
                "idConsultorio=" + idConsultorio +
                ", name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}