
// Calculate student percentage and division
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 3 subjects: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        double p = (m1 + m2 + m3) / 3.0;
        System.out.println("Percentage: " + p);
        if (p >= 60) {
            System.out.println("Result: First Division");
        } 
        else if (p >= 45) {
            System.out.println("Result: Second Division");
        } 
        else if (p >= 33) {
            System.out.println("Result: Third Division");
        } 
        else {
            System.out.println("Result: Fail");
        }
        sc.close();
    }
}
