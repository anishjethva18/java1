
// BankAccount class with Deposit and Withdraw logic using Static values
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int a, String n, double b) {
        accountNumber = a;
        accountHolderName = n;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println();
        System.out.println("Deposited: " + amount);
        System.out.println("Total Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient Balance for withdrawal of " + amount);
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        
        BankAccount b = new BankAccount(101, "Rahul", 5000.0);
        
        System.out.println("Account Holder: " + b.accountHolderName);
        System.out.println("Initial Balance: " + b.balance);
        System.out.println();
        System.out.println("-----------------------------------");
        
        b.deposit(1500.0);
        b.withdraw(2000.0);
        b.withdraw(10000.0);
    }
}