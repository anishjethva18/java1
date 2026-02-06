
// Student class using Parameterized Constructor with static values
class Student {
    int enrollNo;
    String name, gender;

    Student(int e, String n, String g) {
        enrollNo = e;
        name = n;
        gender = g;
    }

    void show() {
        System.out.println("--- Student Details ---");
        System.out.println("Enrollment No: " + enrollNo);
        System.out.println("Name:          " + name);
        System.out.println("Gender:        " + gender);
        System.out.println();
    }
}

public class Q18 {
    public static void main(String[] args) {
        
        Student s1 = new Student(1001, "Jay", "Male");
        Student s2 = new Student(1002, "Nisha", "Female");
        
        s1.show();
        s2.show();
    }
}