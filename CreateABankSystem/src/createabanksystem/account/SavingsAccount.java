
package createabanksystem.account;

public class SavingsAccount extends Account{
    public float interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(float interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double deposit() {
        return super.deposit(); 
       
        
        
        
    }

   
    
    
}
