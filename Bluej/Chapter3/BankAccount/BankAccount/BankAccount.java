public class BankAccount {
    public void mystery(BankAccount that, double amount)
    {
        this.balance = this.balance - amount;
        that.balance = that.balance + amount; 
        BankAccount alexaBankChecking = new BankAccount();
        BankAccount rogerBankChecking = new BankAccount();
        alexaBankChecking.mystery(rogerBankChecking,1000000);
    }
}