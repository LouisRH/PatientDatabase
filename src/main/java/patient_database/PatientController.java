package patient_database;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PatientController {
    private final AtomicLong requestCounter = new AtomicLong();
    @Autowired
    PatientService patientService;

    @GetMapping("/patient")
    public String loadIndex() {
        return "index";
    }

    @PostMapping("/patient")
    public String addPatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
        return "success";
    }

    @GetMapping("/success")
    public String loadSuccess() {
        return "success";
    }
}