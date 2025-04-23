
package leatnwithchatgpt.student;


public class Student {
  public String name;
 public int roll;

    public Student() {
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
//
//    @Override
//    public String toString() {
//        return "Student{" + "name=" + name + ", roll=" + roll + '}';
//    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + '}';   }    
    
    
    
    public void  displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
}
    
   public void changeRoll(int newRoll){
       roll=newRoll;
    }
    
    
    
    
    
    
    
}
