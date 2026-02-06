
// Employee tax calculation
class Q24 {
    String name;
    int age;
    double salary;

    void show() {
        System.out.println("--- Employee Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    void tax() {
        double taxRate;

        if (salary <= 20000) {
            taxRate = 0.001;
        } 
        else if (salary <= 50000) {
            taxRate = 0.002;
        } 
        else {
            taxRate = 0.003;
        }

        double taxAmount = salary * taxRate;
        System.out.println("Calculated Tax: " + taxAmount);
    }

    public static void main(String[] args) {
        Q24 e = new Q24();

        e.name = "Rahul Sharma";
        e.age = 30;
        e.salary = 45000.0;

        e.show();
        e.tax();
    }
}