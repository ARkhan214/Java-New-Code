package evidenceexampracticeprimenumber;

import java.util.Scanner;

public class EvidenceExamPracticePrimeNumber {

    public static void main(String[] args) {
        //prime or not
        Scanner k = new Scanner(System.in);

        System.out.println("check prime or not");
        int input = k.nextInt();

        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

//            Scanner n=new Scanner(System.in);
//            
//            System.out.println("Enter Any Posative number to check Prime or not");
//            int input =n.nextInt();
//            
//            int count=0;
//            
//            for (int i = 1; i <=input; i++) {
//                if (input % i==0) {
//                    count++;                    
//                }   
//                
//        }
//            if (count==2) {
//                    System.out.println(input+" is prime number");
//                }
//                else{System.out.println(input+" is not prime number");}
    }

}
