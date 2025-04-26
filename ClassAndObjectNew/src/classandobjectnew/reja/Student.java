
package classandobjectnew.reja;

public class Student {
        private String name;
    private int id;
    private String email;
    private String mobileNumber;
    private int registrationNumber;
    private String address;
    private String institution;

    public Student() {
    }

    public Student(String name, int id, String email, String mobileNumber, int registrationNumber, String address, String institution) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.registrationNumber = registrationNumber;
        this.address = address;
        this.institution = institution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", email=" + email + ", mobileNumber=" + mobileNumber + ", registrationNumber=" + registrationNumber + ", address=" + address + ", institution=" + institution + '}';
    }
  }
