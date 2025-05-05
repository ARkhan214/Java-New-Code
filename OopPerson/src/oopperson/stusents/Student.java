
package oopperson.stusents;


public class Student extends Person{
    
    public int studentId;

    public Student() {
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String name, int age) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
   public void personDetails() {
       System.out.println("Student Id :"+studentId);
        super.personDetails(); 
        
    }
    
    
}
