package Lesson16;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + " deposited successfully.");
    }

    public void withdraw(double withdrawalAmount) throws InsufficientFundsExseption {
        if (withdrawalAmount > balance) {
            throw new InsufficientFundsExseption("Insufficient funds for withdrawal.");
        }
        balance -= withdrawalAmount;
        System.out.println(withdrawalAmount + " withdrawn successfully.");
    }
    public void transferFunds(BankAccount targetAccount, double transferAmount) throws InsufficientFundsExseption{
        if (transferAmount > balance) {
            throw new InsufficientFundsExseption ("Insufficient funds for transfer.");
        }
        balance-= transferAmount;
        targetAccount.deposit(transferAmount);
        System.out.println(transferAmount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}