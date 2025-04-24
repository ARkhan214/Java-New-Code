package loveletter;

import java.util.Scanner;

public class LoveLetter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter how many times you want Propse");
        int size = s.nextInt();
        s.nextLine();

        System.out.println("Enter your message");
        String message = s.nextLine();
        System.out.println("-------------");
        for (int i = 1; i <= size; i++) {
            System.out.println(count+" : "+message);
        }


                        //Second Way

//        Scanner s=new Scanner(System.in);        
//        System.out.println("Enter how many times you want Propse");
//        int size=s.nextInt();
//        for (int i = 0; i < size; i++) {
//        System.out.println("I Love You");
//        }
//        
        
    
    }

}
