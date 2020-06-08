package cr.una.frontend.web.service;

import cr.una.frontend.web.Constants;
import cr.una.frontend.web.model.logic.Consultorio;
import cr.una.frontend.web.model.logic.Medico;
import cr.una.frontend.web.model.logic.Patient;
import cr.una.frontend.web.model.logic.Servicios_Medicos;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Yendri
 */
public class Service {

    private HashMap<Integer, Patient> registerAppointments;
    private HashMap<Integer, Consultorio> registerConsultorio;
    private HashMap<String, Medico> registerDoctor;

    private static final String REST_CITAS = Constants.WS_ENDPOINT.concat("citas");
    private static final String REST_TIPOS_MEDICOS = Constants.WS_ENDPOINT.concat("tiposmedicos");
    private static final String REST_SERVICIOS = Constants.WS_ENDPOINT.concat("servicios");
    private static final String REST_CONS = Constants.WS_ENDPOINT.concat("consultorios");
    private static final String REST_MEDICOS = Constants.WS_ENDPOINT.concat("medicos");

    private Client client = null;

    public Service() {
        this.registerAppointments = new HashMap<>();
        this.registerConsultorio = new HashMap<>();
        this.registerDoctor = new HashMap<>();
        client =  ClientBuilder.newClient();
    }

    public void updateAppointment(Patient patient) {
        //this.registerAppointments.put(patient.getAppointment().getNumCita(), patient);
        Patient updatedPatient;
        // updatedPatient = client.target(REST_CITAS).request(MediaType.APPLICATION_JSON)
        //         .put(Entity.entity(patient, MediaType.APPLICATION_JSON), Patient.class);
        //System.out.println(patient.toString());
    }

    public ArrayList<Patient> allAppointments() throws Exception {
        List<Patient> appointments = null;
        appointments = Arrays.asList(client.target(REST_CITAS).request(MediaType.APPLICATION_JSON)
                .get(Patient[].class));
        if (appointments.isEmpty()) {
            throw new Exception();
        } else {
            for (Patient patient : appointments) {
                this.registerAppointments.put(patient.getAppointment().getNumCita(), patient);
            }
        }
        return new ArrayList<Patient>(registerAppointments.values());
    }

    public ArrayList<Patient> searchAppointmentById(String id) throws Exception {
        ArrayList<Patient> citas = allAppointments();
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient patient : citas) {
            if (patient.getId().get$oid().equals(id)) {
                result.add(patient);
            }
        }

        if (result.isEmpty()) {
            throw new Exception();
        }
        return result;
    }

    public ArrayList<Patient> searchAppointmentByNumCita(int numCita) throws Exception {
        ArrayList<Patient> citas = allAppointments();
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient patient : citas) {
            if (patient.getAppointment().getNumCita() == numCita) {
                result.add(patient);
            }
        }

        if (result.isEmpty()) {
            throw new Exception();
        }
        return result;
    }

    public ArrayList<Patient> searchAppointmentByName(String name) throws Exception {
        ArrayList<Patient> citas = allAppointments();
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient patient : citas) {
            if (patient.getFirstName().equals(name)) {
                result.add(patient);
            }
        }

        if (result.isEmpty()) {
            throw new Exception();
        }
        return result;
    }

    public Consultorio searchConsultorioByName(String name) throws NullPointerException {
        List<Consultorio> consultorioList = null;
        consultorioList = Arrays.asList(client.target(REST_CONS).request(MediaType.APPLICATION_JSON)
                .get(Consultorio[].class));
        for (Consultorio consultorio : consultorioList) {
            if (consultorio.getName().equals(name)) {
                return consultorio;
            }
        }
        return null;
    }

    public Servicios_Medicos returnServicioMedico(String name) {
        List<Servicios_Medicos> services = null;
        services = Arrays.asList(client.target(REST_SERVICIOS).request(MediaType.APPLICATION_JSON)
                .get(Servicios_Medicos[].class));
        for (Servicios_Medicos serviciosMedicos : services) {
            if (serviciosMedicos.getServicio().equals(name)) {
                return serviciosMedicos;
            }
        }
        return null;
    }

    public Medico returnTypeOfMedic(String nombre) {
        List<Medico> allMedics = null;
        allMedics =  Arrays.asList(client.target(REST_TIPOS_MEDICOS).request(MediaType.APPLICATION_JSON)
                .get(Medico[].class));
        for (Medico medico : allMedics) {
            if (medico.getTipo().equals(nombre)) {
                return medico;
            }
        }
        return new Medico();
    }

    public Medico searchNameDoctor(String nombre) throws NullPointerException {
        List<Medico> medicos = null;
        medicos = Arrays.asList(client.target(REST_MEDICOS).request(MediaType.APPLICATION_JSON)
                .get(Medico[].class));
        for (Medico medico : medicos) {
            if (medico.getName().equals(nombre)) {
                return medico;
            }
        }
        return null;
    }

    static Service the_instance;

    public static Service instance() {
        if (the_instance == null) {
            the_instance = new Service();
        }
        return the_instance;
    }
}

