package arryfromuser;

import java.util.Scanner;

public class ArryFromUser {

    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        
        System.out.println("Enter limit");
        int input = n.nextInt();
        
        String[] names=new String[input];
        int[] marks=new int[input];
        
        for (int index = 0; index <names.length; index++) {
            
            System.out.println("Enter name");
            String value=n.next();
            names[index]=value;
       
            
            System.out.println("Enter marks");
            int mark=n.nextInt();
            marks[index]=mark;
        }
           for (int index = 0; index <names.length; index++) {            
            System.out.println("my name is "+names[index]+" and marks is "+marks[index]);  
        }
        
//         String[] names = new String[5];
//        names[0] = "Hamim";
//        names[1] = "Tamim";
//        names[2] = "Romim";
//        names[3] = "Jamil";
//        names[4] = "Kabil";
//        
//         int[] marks = {30,32,32,31,29};
       
    }
}
       
    


