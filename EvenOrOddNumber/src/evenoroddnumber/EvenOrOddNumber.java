package evenoroddnumber;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        float number=input.nextFloat();
        if (number%2==0 && number>=0) {
            System.out.println(number+" is Even Number");
        }
        else{System.out.println(number+" is Negative Number.");}
        
    }
    
}
