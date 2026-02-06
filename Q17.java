
// Check if a number is an Armstrong number
import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        if (c == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
        sc.close();
    }
}