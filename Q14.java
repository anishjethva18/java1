
// Student details using static method and variable
class Q14 {
    String name;
    int roll;
    static String div;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }

    static void displayDivision() {
        System.out.println("Division: " + div);
    }

    public static void main(String[] args) {
        Q14 student = new Q14();

        student.name = "Anish Jethva";
        student.roll = 2118;
        Q14.div = "B";

        student.displayDetails();
        displayDivision();
    }
}