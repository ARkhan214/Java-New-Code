
package createabanksystem;

import createabanksystem.account.Account;
import createabanksystem.account.CurrentAccount;
import createabanksystem.account.SavingsAccount;
import java.util.Currency;


public class CreateABankSystem {

    
    public static void main(String[] args) {
//        SavingsAccount savings= new SavingsAccount(3.5, "SA12345", 500);
        SavingsAccount savings=new SavingsAccount(4,5, 500);
      
        System.out.println("Savings Account Details:");
        savings.result();
        savings.deposit(5000);
        savings.withdraw(2000);
        savings.result();

        System.out.println("\n------------------------\n");

        // Create a Current Account
        CurrentAccount current=new CurrentAccount(1000, 5, 3000);
    
        System.out.println("Current Account Details:");
        current.result();
        current.deposit(500);
        current.withdraw(4000); // Testing overdraft
        current.result();
     
        
        
    }
    
}
