
// Employee class demonstrating Copy Constructor
class Employee {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
        this.department = other.department;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Salary: " + salary + " | Dept: " + department);
    }
}

class Q23{
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Aman", 75000.0, "IT");

        Employee emp2 = new Employee(emp1);

        emp2.department = "Marketing";

        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("\nCopied Employee (Modified):");
        emp2.display();
    }
}