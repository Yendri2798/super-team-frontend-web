package cr.una.frontend.web.model.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Patient extends Person {
    Id id;
    String date_of_birth;
    String observation;
    String password;
    Appointment appointment;
    Disease disease;
    DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();

    public Patient() {
        super("", "", "", "", "", "");
        this.id = new Id("");
        this.date_of_birth = date.format(calendar.getTime());
        this.observation = "";
        this.password = "";
        this.appointment = new Appointment("", "", "", false, new Consulting_Room(""));
        this.disease = new Disease("");
    }

    /**
     * @param firstName
     * @param lastName
     * @param age
     * @param phone
     * @param address
     * @param email
     * @param id
     * @param date_of_birth
     * @param observation
     * @param password
     * @param disease
     */

    public Patient(String firstName, String lastName, String age, String phone, String address, String email, Id id, String date_of_birth, String observation, String password, Disease disease) {
        super(firstName, lastName, age, phone, address, email);
        this.id = id;
        this.date_of_birth = date_of_birth;
        this.observation = observation;
        this.password = password;
        this.disease = disease;
    }

    public Patient(String firstName, String lastName, String age, String phone, String address, String email, Id id, String date_of_birth, String observation, Appointment appointment) {
        super(firstName, lastName, age, phone, address, email);
        this.id = id;
        this.date_of_birth = date_of_birth;
        this.observation = observation;
        this.appointment = appointment;
    }

    public Patient(String firstName, String lastName, String age, String phone, String address, String email, Id id, String date_of_birth, String observation, String password, Disease disease, Appointment appointment) {
        super(firstName, lastName, age, phone, address, email);
        this.id = id;
        this.date_of_birth = date_of_birth;
        this.observation = observation;
        this.password = password;
        this.disease = disease;
        this.appointment = appointment;
    }

    public Patient(Id id, String firstName, String lastName, Appointment appointment) {
        super(firstName, lastName);
        this.id = id;
        this.appointment = appointment;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Patient(String firstName, String lastName, String age, String phone, String address, String email, String observation) {
        super(firstName, lastName, age, phone, address, email);
        this.observation = observation;
    }



    public Patient(Id id) {
        this.id = id;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", observation='" + observation + '\'' +
                ", password='" + password + '\'' +
                ", appointment=" + appointment +
                ", disease=" + disease +
                '}';
    }


}
