
// BankAccount class with default constructor
class BankAccount {
    String name;
    double bal;

    BankAccount() {
        System.out.println("Bank Account");
    }

    void show() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Current Balance: " + bal);
    }
}

public class Q16 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.name = "Raj Chavda";
        account.bal = 50000.75;
        account.show();
    }
}