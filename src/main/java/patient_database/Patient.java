package patient_database;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @JsonDeserialize(using = DateDeserializer.class)
    private Date DOB;
    private String email;
    private String address;
    private String ssn;

    public Patient() {

    }

    public Patient(long id, String firstName, String lastName, String DOB, String email, String address, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.ssn = ssn;
        try {
            // Parses the DOB string passed from the form into an actual java date object
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDOB = format.parse(DOB);
            this.DOB = parsedDOB;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}