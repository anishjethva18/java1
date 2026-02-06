
// Employee details using static method and variable
class Q15 {
    int id;
    String name, designation;
    double salary;
    static String company;

    static void showComp() {
        System.out.println("Company: " + company);
    }

    void show() {
        System.out.println("ID: " + id + " | Name: " + name + " | Designation: " + designation + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        company = "Tech Corp Inc.";
        Q15[] e = new Q15[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Q15();
            e[i].id = 101 + i;
            e[i].name = "Employee " + (i + 1);
            e[i].designation = "Developer";
            e[i].salary = 50000.0 + (i * 5000);
        }

        showComp();
        System.out.println("\\n--------- Employee Details ---------");
        for (int i = 0; i < 5; i++) {
            e[i].show();
        }
    }
}

/* 
import java.util.Scanner;
class Q15 {

    int id;
    String name, designation;
    double salary;

    static String comp;

    static void showComp() {
        System.out.println("\nCompany: " + comp);
    }

    void show() {
        System.out
                .println("ID: " + id + " | Name: " + name + " | Designation: " + designation + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Company Name: ");
        comp = sc.nextLine();

        Q15[] e = new Q15[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Q15();

            System.out.println("\n--- Entering Details for Employee " + (i + 1) + " ---");

            System.out.print("Enter ID: ");
            e[i].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            e[i].name = sc.nextLine();

            System.out.print("Enter Designation: ");
            e[i].designation = sc.nextLine();

            System.out.print("Enter Salary: ");
            e[i].salary = sc.nextDouble();
            sc.nextLine();
        }

        showComp();
        System.out.println("\n--------- Employee Details ---------");
        for (int i = 0; i < 5; i++) {
            e[i].show();
        }

        sc.close();
    }
}

*/