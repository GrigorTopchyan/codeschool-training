package HomeWork6.HomeTask6;

public class Cylinder extends HomeTask6.Shape {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        //karas miangamic veradarcnes
        return Math.PI* this.height* this.radius*radius;
    }
}
