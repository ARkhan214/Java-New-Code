package evidenceexampreparationfibonacci;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvidenceExamPreparationFibonacci {

    public static void main(String[] args) {
                //Fibonacci Number
     Scanner j=new Scanner(System.in);
     
        System.out.println("Enter number to check Fibonacci");
       int input =j.nextInt();
       
       int number1=0;
       int number2=1;
               
        System.out.println(number1);        
        System.out.println(number2);
        
        int sum=0;
        
        for (int i = 3; i <= input; i++) {
            sum=number1+number2;
            System.out.println(sum);
            
            number1=number2;
            number2=sum;
            
        }
        
        

        //Fibonacci Number


//         Scanner n = new Scanner(System.in);
//        
//        System.out.println("Enter number to check Fibonacci Number");
//        int input = n.nextInt();
//        System.out.println("--------------------");
//        int numner1 = 0;
//        int number2 = 1;
//
//        System.out.println(numner1);
//        System.out.println(number2);
//        
//        int sum = 0;
//        
//        for (int i = 3; i <= input; i++) {
//            sum = numner1 + number2;
//            System.out.println(sum);
//            numner1 = number2;
//            number2 = sum;
//        }
//         System.out.println("--------------------");
        
        
        
        
        
        

        //Fibonacci Number
//        Scanner n = new Scanner(System.in);
//        System.out.println("Enter number to check Fibonacci Number");
//        int input = n.nextInt();
//
//        int[] fiboArray = new int[input];
//        fiboArray[0] = 0;
//        fiboArray[1] = 1;
//
//        for (int i = 2; i <= fiboArray.length - 1; i++) {
//            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
//
//        }
//        System.out.println(Arrays.toString(fiboArray));
    }

}
