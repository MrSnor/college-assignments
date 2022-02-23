package classWork;

public class q17 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20);
        System.out.println(circle1.area());
        System.out.println(String.format("%.2f", circle1.circumference()));
    }
}

class Circle {

    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    double area() {
        return radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}
