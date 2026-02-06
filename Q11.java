
// Find factorial using method
import java.util.Scanner;

class Q11 {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int factorial = fact(sc.nextInt());

        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
