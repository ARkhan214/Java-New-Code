/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interestrate;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class InterestRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner( System.in);
        System.out.println("Enter Interest Rate");
        
        double interestRate=s.nextDouble();
        
        double monthlyInterest=interestRate/1200;
        
        System.out.println("Enter Year");
        
        int numberOfYear=s.nextInt();
        
        System.out.println("Enter Lone Amount");
        
        double loaneAmount=s.nextDouble();  
        
        
double monthlyPayment=loaneAmount*monthlyInterest / 
        (1-1/Math.pow(1+monthlyInterest,numberOfYear*12));
double totalPayment=monthlyPayment+numberOfYear*12;


        System.out.println("Monthly Payment is "+monthlyPayment);
                System.out.println("Total Payment is "+totalPayment);


    }
    
}
