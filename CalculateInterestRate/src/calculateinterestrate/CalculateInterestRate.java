
package calculateinterestrate;

import java.util.Scanner;


public class CalculateInterestRate {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Interest rate.Reat must be dacimale number");
        
        double interestRate=s.nextDouble();
        double monthlyInterestRate=interestRate/1200;
        
        System.out.println("Enter Number of Year");
        int numberofYear=s.nextInt();

          System.out.println("Enter Lone Amount");
        double loanAmount=s.nextDouble();
        
        
        double monthlyPayment= loanAmount*monthlyInterestRate/(1
                -1 / Math.pow(1+monthlyInterestRate,numberofYear*12));
        
        double totalPayment=monthlyPayment*numberofYear*12;
        
        System.out.println("The monthly payment  "+monthlyPayment+" taka");
        System.out.println("The total Payment "+totalPayment+" taka");
        
        
        
        
//        double result=(loanAmount/interestRate)*numberofYear;
//        System.out.println(result);
        
    }
    
}
