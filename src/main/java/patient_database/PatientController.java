package patient_database;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    private final AtomicLong requestCounter = new AtomicLong();

    // A ton of stuff below needs to be changed, right now it's just a placeholder
    @RequestMapping("/patient")
    public Patient patient(@RequestParam(value="firstName", defaultValue="Bob") String firstName) {
        return new Patient(requestCounter.incrementAndGet(), firstName, "Ross", "1/1/2000", "bobross@bobross.com", "123 Fake St", "111-11-111");
    }
}