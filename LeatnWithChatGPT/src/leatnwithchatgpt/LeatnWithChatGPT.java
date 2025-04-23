package leatnwithchatgpt;

import leatnwithchatgpt.student.Student;

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

//s.displayInfo();
    }

}
