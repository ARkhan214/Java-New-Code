
package creatapersonclassclasstest.stusents;


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

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
   public void personDetails() {
        super.personDetails(); 
        System.out.println("Student Id: "+studentId);
    }
    
    
//
//    @Override
//    public String toString() {
//        return "Student{" + "studentId=" + studentId +" "+"Student Name"+name+" "+" Student Age "+age+ '}';
//    }
    
    
    
    
    
    
}
