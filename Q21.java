
// Student marks and grade calculation using Parameterized Constructor
class StudentGradeCons {
    String name;
    int m1, m2, m3;

    StudentGradeCons(String n, int a, int b, int c) {
        this.name = n;
        this.m1 = a;
        this.m2 = b;
        this.m3 = c;
    }

    double calculateAverage() {
        return (m1 + m2 + m3) / 3.0;
    }

    String getGrade() {
        double avg = calculateAverage();
        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else
            return "F";
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("Final Grade: " + getGrade());
        System.out.println("---------------------------");
    }
}

public class Q21 {
    public static void main(String[] args) {
        
        StudentGradeCons student1 = new StudentGradeCons("Amit", 85, 90, 78);
        StudentGradeCons student2 = new StudentGradeCons("Priya", 55, 62, 58);
        StudentGradeCons student3 = new StudentGradeCons("Vijay", 30, 45, 25);
        
        student1.display();
        student2.display();
        student3.display();
    }
}