package Lesson16;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(12345,"Samir",1000);
            BankAccount account2 = new BankAccount(56789,"Pervin",2000);
            account1.deposit(200);
            account1.withdraw(100);
            account1.transferFunds(account2,300);
            System.out.println("Account 1 balance:" + account1.getBalance());
            System.out.println("Account 2 balance:"+ account2.getBalance());
        } catch (InsufficientFundsExseption e){
            System.out.println("Error:"+ e.getMessage());
        }
    }
}
