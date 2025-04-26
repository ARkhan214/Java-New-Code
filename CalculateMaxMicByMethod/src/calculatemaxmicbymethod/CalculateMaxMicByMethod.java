
package calculatemaxmicbymethod;


import java.util.Arrays;
import java.util.Scanner;

public class CalculateMaxMicByMethod {

    static Scanner s=new Scanner(System.in);
    
    public static void main(String[] args) { 
        System.out.println("Enter limit");
        int size=s.nextInt();
        String result=doMaxMin(size);
        System.out.println(result);
<<<<<<< Updated upstream
        
=======
>>>>>>> Stashed changes
        
//        System.out.println("Enter limit");
//        int size=s.nextInt();
//        doMaxMin(size);
        }
//    public static void doMaxMin(int size){
//        
//        int[] numbers=new int[size];
//        for (int index = 0; index <size; index++) {
//            System.out.println("Enter Number "+(index+1));
//            int userInput=s.nextInt();
//            numbers[index]=userInput;
//        }
//        System.out.println("My number are "+Arrays.toString(numbers));
//        
//           int maxNumber=numbers[0];
//        int minNumber=numbers[0];
//        
//     for(int number:numbers){
//          if (number > maxNumber) {
//                maxNumber = number;
//            }
//            
//            if(number < minNumber){
//                minNumber = number;
//            }
//        }
//           System.out.println("Max Number is "+ maxNumber);
//        System.out.println("Min Number is "+ minNumber);
//    
//    }
    
   
    
    
    
    
    
    
    
    public static String doMaxMin(int size){
        
        int[] numbers=new int[size];
        
        
        for (int index = 0; index <size; index++) {
            System.out.println("Enter Number "+(index+1));
            int userInput=s.nextInt();
            numbers[index]=userInput;
        }
        
        System.out.println("My number are "+Arrays.toString(numbers));
        
           int maxNumber=numbers[0];
        int minNumber=numbers[0];
        
     for(int number:numbers){
          if (number > maxNumber) {
                maxNumber = number;
            }
            
            if(number < minNumber){
                minNumber = number;
            }
        }
     String message = "Max Number is "
                + maxNumber + "\n"
                + "Min Number is "
                + minNumber;
     return message;
    }
}
