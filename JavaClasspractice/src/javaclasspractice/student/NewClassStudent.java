
package javaclasspractice.student;


public class NewClassStudent {
    private String name;
    private String studentID;
    private String department;

    public NewClassStudent() {
    }

    public NewClassStudent(String name, String studentID, String department) {
        this.name = name;
        this.studentID = studentID;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "NewClassStudent{" + "name=" + name + ", "
                + "studentID=" + studentID + ", department=" + department + '}';
    }
    
    
    
    
    
}
