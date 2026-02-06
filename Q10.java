
// Menu driven calculator
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        System.out.print("Choice: ");
        int c = sc.nextInt();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Sum: " + (a + b));
                break;
            case 2:
                System.out.println("Difference: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
