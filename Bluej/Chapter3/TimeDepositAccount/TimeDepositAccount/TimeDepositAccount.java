public class TimeDepositAccount {
    private double interestRate;
    private double balance;
    
    public TimeDepositAccount() {
        this.interestRate = 0.05;
        this.balance = 20;
    }
    
    public double getBalance() {
        return this.balance; 
    }
    
    public void addInterest() {
        this.balance = this.balance + (this.balance * this.interestRate);
    }
    
    public void withdraw() {
        this.balance -= this.balance;
    }
}