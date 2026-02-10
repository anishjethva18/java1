// BankAccount class with Deposit and Withdraw logic using Static values
class BankAccount1 {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount1(int a, String n, double b) {
        this.accountNumber = a;
        this.accountHolderName = n;
        this.balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("\nDeposited: " + amount);
        System.out.println("Total Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("\nError: Insufficient Balance for withdrawal of " + amount);
        } else {
            balance = balance - amount;
            System.out.println("\nWithdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    void displayInfo() {
        System.err.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Initial Balance: " + balance);
    }
}

public class Q20 {
    public static void main(String[] args) {
        BankAccount1 b = new BankAccount1(101, "Rahul", 5000.0);

        b.displayInfo();
        System.out.println("-----------------------------------");

        b.deposit(1500.0);
        b.withdraw(2000.0);
        b.withdraw(10000.0);
    }
}
