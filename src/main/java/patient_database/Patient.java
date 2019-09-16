package patient_database;

public class Patient {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String DOB;
    private final String email;
    private final String address;
    private final String ssn;

    public Patient(long id, String firstName, String lastName, String DOB, String email, String address, String ssn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email = email;
        this.address = address;
        this.ssn = ssn;
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

    public String getDOB() {
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
}