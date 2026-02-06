
// BankManagement menu driven program
import java.util.Scanner;

class Account {
    int accountNumber;
    String holderName;
    double balance;

    void createAccount(int acc, String name, double initialBal) {
        accountNumber = acc;
        holderName = name;
        balance = initialBal;
        System.out.println("Account created successfully for " + name);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited. New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn. Remaining Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account user = new Account();
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    user.createAccount(acc, name, bal);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();
                    user.deposit(dAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    user.withdraw(wAmount);
                    break;

                case 4:
                    user.checkBalance();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}