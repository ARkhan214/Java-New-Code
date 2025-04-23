
package evidenceexampreparationdiscountprice;

import java.util.Scanner;


public class EvidenceExamPreparationDiscountPrice {

    
    public static void main(String[] args) {
       //discount price
    
     Scanner n=new Scanner(System.in);
        
        System.out.println("Enter your price");
        float price=n.nextFloat();
        
        if (price>200) {
            System.out.println("Congratulation sir you got 5 Percent discount ");
            float discount= (price/100)*5;
            float discountPrice=price-discount;
            System.out.println("You Have to Pay "+discountPrice);
        }
        else{System.out.println("You Have to Pay "+price);}

    }
    
}
