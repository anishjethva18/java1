
// Palindrome number using method
import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num = num / 10;
        }

        if (original == reversed)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("Not a Palindrome.");

        sc.close();
    }
}
