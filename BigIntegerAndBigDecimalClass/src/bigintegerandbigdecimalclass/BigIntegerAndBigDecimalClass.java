
package bigintegerandbigdecimalclass;

import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegerAndBigDecimalClass {

    public static void main(String[] args) {
        
        BigInteger number1=new BigInteger("300000000000000000000000700");
        BigInteger number2=new BigInteger("200000000000000000000000200");
        
        BigInteger result=number1.multiply(number2);
        
        System.out.println("Number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
        System.out.println("Multiply of number 1 and number 2 is: "+result);        
        System.out.println("-------------------------");
        
        number1.subtract(number2);        
        
        System.out.println("Number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
        System.out.println("Subtract of number 1 and number 2 is: "+number1);
        System.out.println("--------------------------");
        
        number1.add(number2);
        
        System.out.println("Number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
        System.out.println("Addition of number 1 and number 2 is: "+number1);
        System.out.println("--------------------------");
        
        number1.divide(number2);
        
        System.out.println("Number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
        System.out.println("Divide of number 1 and number 2 is: "+number1);
        System.out.println("--------------------------");
        
        //Making Factorial by using BigInteger.
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Value to Check Factorial Value");
        int input=s.nextInt();
        
        BigInteger factorial=BigInteger.ONE;    //1,2,6,24,120...............last number porjonto
                //1,        1+1=2,    2+1=3,       3+1=4,    4 +1=5..........input
                //i*f,      i*f,      i*f,         i*f,      i*f.............inpit      //Evabe kaj kore for loop.
                //1*1=1,    2*1=2,    3*2=6,       4*6=24,   5*24=120........input
        for (int i = 1; i <= input ; i++) {
            
            factorial=factorial.multiply(BigInteger.valueOf(i)); 
            
            System.out.println("----------------------");
            System.out.println("Factorial is: "+factorial);   
             
        }
        System.out.println("Factorial is: "+factorial);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
