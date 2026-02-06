
// Check if integer is multiple of 5
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 5 == 0)
            System.out.println("Multiple of 5");
        else
            System.out.println("Not a multiple of 5");
        sc.close();
    }
}
