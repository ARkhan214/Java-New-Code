
package createabanksystem.account;


public class CurrentAccount extends Account{
   public double overdraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(double overdraftLimit, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
//       double balance = getBalance();

        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully (with overdraft if needed).");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }


        
        
    }

    @Override
    public void result() {
        super.result();
         System.out.println("Overdraft Limit: $" + overdraftLimit);


// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
    
    
    
}
