
package createabanksystem.account;


public class Account {
    public int accountNumber;
    public double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double withdraw(){
    return balance;
    }
    
    public double deposit(){
    return balance;
    }
    
    
    
    
}
