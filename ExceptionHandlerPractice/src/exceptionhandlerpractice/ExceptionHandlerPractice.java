package exceptionhandlerpractice;

import java.util.Scanner;

public class ExceptionHandlerPractice {

    public static void main(String[] args) {
//        try {
//            int divition=10/0;
//            System.out.println("Result is: "+divition);
//        } catch (ArithmeticException e) {
//            System.out.println("Division by zero is not allowed");
//        }
//        finally{
//            System.out.println("Exicution Finished");
//        
//        }

        
        
        Scanner s=new Scanner(System.in);
        
        try {
             System.out.println("enter number");
             int number1=s.nextInt();
             System.out.println(number1);
             
             
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
    }

}


//Error: Division by zero is not allowed!
//Exicution Finished