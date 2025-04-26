package newexamquestion;

import java.util.Scanner;

public class NewExamQuestion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //3,8
        int sum = 0;
        //3+5
        for (;;) {

            System.out.println("Enter number");
            int num = s.nextInt();
            if (num < 0) {
//                int minus=num;
//            System.out.println("Sum of intiger is "+(sum+minus)+"\n"+" Enter posative number");
                System.out.println("Enter posative number");
                break;
            }
            sum += num;

        }

        System.out.println("Sum of intiger is " + sum);

//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter number");
//            int num = s.nextInt();
//
//            if (num < 0) {
//                System.out.println("Enter posative number");
//               break;
//            }
//            sum += num;
//            
//            System.out.println("Sum of intiger is " + sum);
//
//        }
//        Scanner s = new Scanner(System.in);
//
//        int sum = 0;
//
//        for (;;) {
//            System.out.println("Enter number");
//            int num = s.nextInt();
//
//            if (num < 0) {
//                int minus=num;
//            System.out.println("Sum of intiger is "+(sum+minus)+"\n"+" Enter posative number");
//               break;
//            }
//            sum += num;
//            
//            System.out.println("Sum of intiger is " + sum);
//
//        }
//        
        //posative number dila number jog korbe ar negative dile break kore posative gular jog dekhabe.
//         Scanner s = new Scanner(System.in);
//         
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter number");
//            int num = s.nextInt();
//
//            if (num < 0) {
//                System.out.println("Enter posative number");
//               break;
//            }
//            sum += num;        
//        }
//          System.out.println("Sum of intiger is " + sum);
//    
        //posative number dila ager number re jog theke minus kore daba abong final result dekhabe.
//        Scanner s = new Scanner(System.in);
//        int sum = 0;
//        int minus=0;
//        while (true) {
//            
//            
//            System.out.println("Enter number");
//            int num = s.nextInt();
//
//            if (num < 0) {
//                minus=num;
//                
//                System.out.println("Enter posative number");
//               break;
//            }
//            sum += num;        
//        }
//          System.out.println("Sum of intiger is " + (sum+minus));
    }

}
