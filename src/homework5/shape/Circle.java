package homework5.shape;

import static java.lang.StrictMath.PI;

public class Circle extends Shape {
    /**
     * 4.2 Create subclass of Shape with name Circle which contains:
     * An instance variable radius (double).
     * Three constructors as shown. The no-arg constructor initializes the radius to 1.0.
     * Getter and setter for the instance variable radius.
     * Methods getArea() and getPerimeter().
     * Override the toString() method inherited,
     * to return "A Circle with radius=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
     */
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        //karas miangamic return anes
        return PI * radius * radius;
    }


    public double gePerimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return " A Circle with radius = " + radius + ", which is a subclass of " + super.toString();

    }
}
