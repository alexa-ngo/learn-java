public class BankAccount {
    private double _balance;
    
    public BankAccount(double initialBalance) {
        this._balance = initialBalance;
    }
    
    public void deposit(double amount) {
        this._balance += amount;
    }
    
    public void withdraw(double amount) {
        this._balance -= amount;
    }
    
    public double getBalance() {
        return this._balance;
    }
}