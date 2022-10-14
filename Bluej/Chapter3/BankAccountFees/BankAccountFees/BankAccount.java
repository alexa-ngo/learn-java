public class BankAccount {
    private double balance;
    private double transaction; 
    private double transactionFee;

    public BankAccount() {
        balance = 0;
        transaction = 0;
        transactionFee = 0;
    }
    
    public BankAccount(double initalBalance) {
        balance = initalBalance;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
        transaction += 1;
    }
    
    public void withdraw(double amount) {
        balance = balance - amount;
        transaction +=1;
    }
    
  //  public void transactionFee(double transaction) {
    //    if (transaction > 5)
   //         transactionFee += transaction -5; 
   // }
    
    public double getMonthlyBal(){
        if (transaction >5)
            transactionFee += transaction -5;
            balance = balance - transactionFee;
        return balance; 
    }
}