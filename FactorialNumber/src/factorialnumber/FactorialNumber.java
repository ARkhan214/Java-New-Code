
package factorialnumber;

import java.util.Scanner;


public class FactorialNumber {

    
    public static void main(String[] args) {
        
      Scanner d=new Scanner(System.in);
      
        System.out.println("factor  find");
        int userNumber=d.nextInt();
        
        int factorial=1;
        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;            
        }
        System.out.println("Factorial is "+factorial);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
//       Scanner s=new Scanner(System.in);
//        
//        System.out.println("Enter number");
//        int input=s.nextInt();
//        int factorial=1;
//        
//        for (int i = 1; i <=input; i++) {
//            factorial*=i;
//        }
//        
//        System.out.println("Factorial of "+input+" is "+factorial);
//    }
    
}
