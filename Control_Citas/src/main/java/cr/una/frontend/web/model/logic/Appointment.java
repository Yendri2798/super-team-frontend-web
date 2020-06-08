package cr.una.frontend.web.model.logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Appointment {
    private String date;
    private String hour;
    private String reason;
    private boolean state;
    private boolean confirm;
    private Consulting_Room consulting_room;
    private Servicios_Medicos serviciosMedicos;
    SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();
    private int numCita = 0;

    public Appointment() {
        this.date = date1.format(calendar.getTime());
        this.hour = "     ";
        this.reason = "";
        this.state = false;
        this.confirm = false;
        this.consulting_room = new Consulting_Room("");
    }

    /**
     * @param date
     * @param hour
     * @param reason
     * @param state
     * @param consulting_room
     */

    public Appointment(String date, String hour, String reason, boolean state, Consulting_Room consulting_room) {
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.state = state;
        this.consulting_room = consulting_room;
    }

    public Appointment(int numCita, String date, String hour, String reason, boolean state, Consulting_Room consulting_room) {
        this.numCita = numCita;
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.state = state;
        this.consulting_room = consulting_room;
    }

    public Appointment(int numCita, String date, String hour, String reason, boolean state, boolean confirm, Consulting_Room consulting_room) {
        this.numCita = numCita;
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.state = state;
        this.confirm = confirm;
        this.consulting_room = consulting_room;
    }

    public Appointment(String date, String hour, String reason, boolean state, boolean confirm, Consulting_Room consulting_room) {
        this.numCita = numCita;
        this.date = date;
        this.hour = hour;
        this.reason = reason;
        this.state = state;
        this.confirm = confirm;
        this.consulting_room = consulting_room;
    }

    public Appointment(String hour, String reason, int numCita) {
        this.hour = hour;
        this.reason = reason;
        this.numCita = numCita;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public Consulting_Room getConsulting_room() {
        return consulting_room;
    }

    public void setConsulting_room(Consulting_Room consulting_room) {
        this.consulting_room = consulting_room;
    }

    public int getNumCita() {
        return numCita;
    }

    public void setNumCita(int numCita) {
        this.numCita = numCita;
    }

    public Servicios_Medicos getServiciosMedicos() {
        return serviciosMedicos;
    }

    public void setServiciosMedicos(Servicios_Medicos serviciosMedicos) {
        this.serviciosMedicos = serviciosMedicos;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", reason='" + reason + '\'' +
                ", state=" + state +
                ", confirm=" + confirm +
                ", consulting_room=" + consulting_room +
                ", serviciosMedicos=" + serviciosMedicos +
                ", numCita=" + numCita +
                '}';
    }
}
