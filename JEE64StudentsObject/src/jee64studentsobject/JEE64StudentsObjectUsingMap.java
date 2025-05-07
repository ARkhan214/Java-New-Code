package jee64studentsobject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import jee64studentsobject.student.Student;

public class JEE64StudentsObjectUsingMap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID");

        int userInput = s.nextInt();

        Map<Integer, Student> studentInfo = new HashMap<>();

        studentInfo.put(1, new Student("Habib", 275, "Bangadesh"));
        studentInfo.put(2, new Student("Zarif", 276, "Bangadesh"));
        studentInfo.put(3, new Student("Ruman", 277, "Bangadesh"));
        studentInfo.put(4, new Student("Rakib", 274, "Bangadesh"));
        studentInfo.put(5, new Student("Habib", 275, "Bangadesh"));
        studentInfo.put(6, new Student("Zarif", 276, "Bangadesh"));
        studentInfo.put(7, new Student("Ruman", 277, "Bangadesh"));
        studentInfo.put(8, new Student("Rakib", 274, "Bangadesh"));
        studentInfo.put(9, new Student("Habib", 275, "Bangadesh"));
        studentInfo.put(10, new Student("Zarif", 276, "Bangadesh"));
        studentInfo.put(11, new Student("Ruman", 277, "Bangadesh"));
        studentInfo.put(12, new Student("Rakib", 274, "Bangadesh"));
        studentInfo.put(13, new Student("Ruman", 277, "Bangadesh"));
        studentInfo.put(14, new Student("Rakib", 274, "Bangadesh"));

       // System.out.println(studentInfo);
        System.out.println("===========");

//        Iterator<Map.Entry<Integer,Student>> lists=studentInfo.entrySet().iterator();
//                  
//        while (lists.hasNext()) {
//        Map.Entry<Integer, Student> entry=lists.next();
//            System.out.println("Key: "+entry.getKey()+", Value: "+ entry.getValue());
//            
//        }
//        System.out.println(studentInfo.get(userInput));
        System.out.println(studentInfo.get(userInput));

        //
//          Iterator<Map.Entry<Integer, Student>> li = studentInfo.entrySet().iterator();
//        
//        while (li.hasNext()) {
//            Map.Entry<Integer, Student> entry = li.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
    }

}
