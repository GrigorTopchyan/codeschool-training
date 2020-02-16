package HomeWork6.HomeTask6;

public class Cylinder extends HomeWork6.HomeTask6.Shape {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        double area=Math.PI*this.height*this.radius*radius;
        return area;
    }
}
