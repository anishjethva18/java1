
// Shape class demonstrating Constructor Overloading
class Shape {
    double area;

    Shape(double radius) {
        area = 3.14 * radius * radius;
    }

    Shape(double length, double width) {
        area = length * width;
    }

    Shape(double base, double height, int dummy) {
        area = 0.5 * base * height;
    }

    void displayArea() {
        System.out.println("The calculated area is: " + area);
    }
}

public class Q22 {
    public static void main(String[] args) {
        
        System.out.println("--- Circle ---");
        Shape circle = new Shape(5.0);
        circle.displayArea();
        
        System.out.println("\n--- Rectangle ---");
        Shape rect = new Shape(10.0, 4.0);
        rect.displayArea();
        
        System.out.println("\n--- Triangle ---");
        Shape tri = new Shape(6.0, 8.0, 0);
        tri.displayArea();
    }
}