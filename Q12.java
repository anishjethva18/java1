
// Fibonacci series using method
import java.util.Scanner;

class Q12 {
    static void fib(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for limit: ");
        fib(sc.nextInt());
        sc.close();
    }
}
