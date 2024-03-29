package patient_database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }
}
