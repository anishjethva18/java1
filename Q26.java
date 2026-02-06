// Method overloading demonstrating a Banking System
class Bank {
    void deposit(int amount) {
        System.out.println("--- Cash Deposit ---");
        System.out.println("Cash Deposit Successful: " + amount);
    }

    void deposit(int amount, String chequeNo) {
        System.out.println("\n--- Cheque Deposit ---");
        System.out.println("Cheque No: " + chequeNo + " | Amount: " + amount);
        System.out.println("Cheque Deposit Successful!");
    }

    void deposit(double amount, String transactionId) {
        System.out.println("\n--- Online Transfer ---");
        System.out.println("Transaction ID: " + transactionId + " | Amount: " + amount);
        System.out.println("Online Transfer Successful!");
    }
}

public class Q26 {
    public static void main(String[] args) {
        Bank b = new Bank();
        
        b.deposit(5000);
        b.deposit(12000, "CHQ998877");
        b.deposit(25500.50, "TXN44556677");
    }
}