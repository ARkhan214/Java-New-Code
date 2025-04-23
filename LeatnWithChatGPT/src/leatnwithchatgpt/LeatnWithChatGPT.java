package leatnwithchatgpt;

import leatnwithchatgpt.student.Student;
import leatnwithchatgpt.teachers.Teachers;

public class LeatnWithChatGPT {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "MD Rahim khan";
        s.roll = 5;

        s.setName("Reja");
        s.setRoll(1);
        
        
        s.displayInfo();
        s.changeRoll(7);
        
        System.out.println(s);
        
        
        
        
        
        Teachers master=new Teachers();
        master.setAge(35);
        System.out.println(master);
        
        

//s.displayInfo();
    }

}
