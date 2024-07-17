package Methods;

public class BankAccount {
    static int totalaccounts;
    public BankAccount(){
        totalaccounts++;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println("Total number of bank acconts: " + totalaccounts);
    }
}
