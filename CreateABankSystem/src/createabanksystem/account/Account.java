
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
    
      public void deposit(double amount){
          if (amount>0) {
              balance +=amount;
              System.out.println(amount+" taka Diposit successfully");
          }
               else {
            System.out.println("Invalid deposit amount.");
        }               
    }
    
    
    public void withdraw(double amount){
        if (amount>0 && balance>=amount) {
            balance -=amount;
            
            System.out.println(amount+" taka withraw success");
        }
        else{System.out.println("Invalid amount");}
        
    }
    
    
    
    public void result(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    
    }
  
    
    
    
    
}
