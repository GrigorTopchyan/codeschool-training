package HomeWork6.HomeTask6;

public class Circle extends HomeTask6.Shape {
    private double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 0;
    }
}
