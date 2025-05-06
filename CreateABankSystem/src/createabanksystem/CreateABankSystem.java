package createabanksystem;

import createabanksystem.account.CurrentAccount;
import createabanksystem.account.SavingsAccount;

public class CreateABankSystem {

    public static void main(String[] args) {
        // TODO code application logic here

        SavingsAccount savings = new SavingsAccount(3.5, "SA12345", 500);

        System.out.println("Savings Account Details:");
        savings.printDetails();
        savings.deposit(5000);
        savings.withdraw(2000);
        savings.printDetails();

        System.out.println("\n------------------------\n");

        // Create a Current Account
        CurrentAccount current = new CurrentAccount(1000, "CA98765", 3000);

        System.out.println("Current Account Details:");
        current.printDetails();
        current.deposit(500);
        current.withdraw(4000); // Testing overdraft
        current.printDetails();       
       
    }
}
