
// Java program to make pattern
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Rows: ");
        int r = sc.nextInt();
        int i, j;
        int c = 1;
        
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
