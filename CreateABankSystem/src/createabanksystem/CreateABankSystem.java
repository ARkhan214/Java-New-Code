
package createabanksystem;

import createabanksystem.account.Account;
import createabanksystem.account.CurrentAccount;
import createabanksystem.account.SavingsAccount;
import java.util.Currency;


public class CreateABankSystem {

    
    public static void main(String[] args) {
//        Account a=new Account(10, 2000);
        SavingsAccount s=new SavingsAccount(10, 1, 1000);
        float interestRate = s.interestRate;
        double balance = s.balance;
        System.out.println(balance);

        
        
        CurrentAccount c=new CurrentAccount(200, 25, 3000);
        System.out.println(c.overdraftLimit);
        
    }
    
}
