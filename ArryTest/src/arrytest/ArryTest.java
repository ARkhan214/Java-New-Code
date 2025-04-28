package arrytest;

import java.util.Arrays;

public class ArryTest {

    public static void main(String[] args) {
        
        
        String[] names = new String[5];
//        String[] names = {"Hamim","Tamim","Romim","Jamil","Kabil"};
        names[0]="Hamim";
      names[1]="Tamim";
      names[2]="Romim";
      names[3]="Jamil";
      names[4]="Kabil";
        
        
        int[] marks = {30,32,32,31,29};
        
        for (int index = 0; index <names.length; index++) {
//            if (index == 2) {
//                continue;
//            }
            
            System.out.println("my name is "+names[index]+" and marks is "+marks[index]);
        }
        
       
        
        
        
        
//        int[] marks = new int[5];
//        
//        marks[0]=30;
//        marks[1]=32;
//        marks[2]=33;
//        marks[3]=32;
//        marks[4]=30;
        

    
//        System.out.println("My name is "+Arrays.toString(marks)+" my marks is "+Arrays.deepToString(names));
//        System.out.println(Arrays.toString(names));
        
        
//        marks System
//        .out.println(names[]);
    }

}
