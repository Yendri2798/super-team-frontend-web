package cr.una.frontend.web.controller;

import cr.una.frontend.web.model.logic.Patient;
import cr.una.frontend.web.service.Service;
/**
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
**/
import java.util.List;

/**
 * @author Yendri
 */

//@Controller
public class ControllerAllAppointment {

    // Appointment Service
    private Service service = new Service();

/**
    @GetMapping("/appointments")
    public String students(Model model) throws Exception {
        List<Patient> appointmentList;
        appointmentList = service.allAppointments();

        model.addAttribute("appointmentList", appointmentList);

        // Esta es la vista (appointments.html)
        return "appointments";
    }
    **/

}
