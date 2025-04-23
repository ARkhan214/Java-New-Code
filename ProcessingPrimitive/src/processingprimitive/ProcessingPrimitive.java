package processingprimitive;

import java.math.BigInteger;
import java.util.Scanner;

public class ProcessingPrimitive {

    public static void main(String[] args) {
        BigInteger a=new BigInteger("347875487");
     
        
//        BigInteger input=s.nextBigInteger();




        Scanner s = new Scanner(System.in);

        System.out.println("enter number to check factorial");

        int input = s.nextInt();
      

//        BigInteger factorial = BigInteger.ONE;
        BigInteger factorial = new BigInteger("1");
        

        for (int i = 1; i <= input; i++) {
            factorial =factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

}
