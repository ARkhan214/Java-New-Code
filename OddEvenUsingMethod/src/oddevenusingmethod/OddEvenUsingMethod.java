
package oddevenusingmethod;

import java.util.Scanner;


public class OddEvenUsingMethod {

  
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter number");
//         int input=s.nextInt();
//         String finalResult=oddEven(input);
//        System.out.println(finalResult);
        

Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int userinput=s.nextInt();
        String result=findFactorial(userinput);
        System.out.println(result);
    }
    
    
//    public static String oddEven(int input){
//       String result="";
//      
//       if (input%2==0) {
//           result=input+" Even Number";
//       }
//       else{result=input+" Odd Number";}
//       
//       return result;
//   }
    
    public static String findFactorial(int input){
    String result="";
//    int input;
    int count=1;
    int factorial=1;
    
        if (input<0) {
            result=input+" is not a posative value please Enter posative value";            
        }
        else{
            do {                
               long finreg= factorial*=count;
                count++;
                result="Factorial is "+finreg;
            } while (count<=input);
            
        }
//        result="Factorial is "+factorial;
        
              
        return result;
    }
    
    
    
}
