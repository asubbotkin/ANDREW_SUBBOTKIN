package homework_nr_4;

public class Circle {
    int radius;
    static void calculateArea(int radius) {
        float pi = 3.14f;
        System.out.println("Area of circle with radius is: " + (float)Math.pow(radius, 2) * pi);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        int radius = 11;
        Circle newCircle = new Circle(radius);

        newCircle.calculateArea(radius);
    }

}
