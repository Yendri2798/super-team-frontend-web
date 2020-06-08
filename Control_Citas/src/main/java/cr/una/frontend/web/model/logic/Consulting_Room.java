package cr.una.frontend.web.model.logic;

public class Consulting_Room {
    private String name;
    private String phone;
    private String medical_care;
    private String nameDoctor;
    private Appointment appointment;
    private Consultorio consultorio;
    private Medico medico;

    public Consulting_Room() {

    }

    /**
     * @param name
     * @param phone
     * @param medical_care
     */

    public Consulting_Room(String name, String phone, String medical_care) {
        this.name = name;
        this.phone = phone;
        this.medical_care = medical_care;
    }

    public Consulting_Room(String name, String phone, String medical_care, String nameDoctor) {
        this.name = name;
        this.phone = phone;
        this.medical_care = medical_care;
        this.nameDoctor = nameDoctor;
    }

    public Consulting_Room(String name) {
        this.name = name;
        this.phone = "";
        this.medical_care = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMedical_care() {
        return medical_care;
    }

    public void setMedical_care(String medical_care) {
        this.medical_care = medical_care;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Consulting_Room{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", medical_care='" + medical_care + '\'' +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", appointment=" + appointment +
                ", consultorio=" + consultorio +
                ", medico=" + medico +
                '}';
    }
}
