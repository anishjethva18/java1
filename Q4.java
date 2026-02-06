
// Check if a number is divisible by 5 and 11
import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 5 == 0 && number % 11 == 0)
            System.out.println("Divisible by 5 and 11");
        else
            System.out.println("Not Divisible by 5 and 11");
        sc.close();
    }
}
