package patient_database;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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