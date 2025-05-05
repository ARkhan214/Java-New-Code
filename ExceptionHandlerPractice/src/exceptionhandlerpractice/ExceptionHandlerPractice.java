package exceptionhandlerpractice;

public class ExceptionHandlerPractice {

    public static void main(String[] args) {
        try {
            int divition=10/0;
            System.out.println("Result is: "+divition);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        finally{
            System.out.println("Exicution Finished");
        
        }

    }

}


//Error: Division by zero is not allowed!
//Exicution Finished