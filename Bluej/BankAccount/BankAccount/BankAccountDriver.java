public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount rogerAccount = new BankAccount(300);
        BankAccount alexaAccount = new BankAccount(500);
        
        System.out.println("Roger's initial balance " + rogerAccount.getBalance());
        System.out.println("Alexa's initial balance " + alexaAccount.getBalance());
        
        alexaAccount.withdraw(250);
        System.out.println("Alexa's balance " + alexaAccount.getBalance());
        System.out.println("Roger's balance " + rogerAccount.getBalance());
        
        rogerAccount.deposit(100);
        alexaAccount.deposit(175);
        System.out.println("Alexa's balance " + alexaAccount.getBalance());
        System.out.println("Roger's balance " + rogerAccount.getBalance());
    }
}