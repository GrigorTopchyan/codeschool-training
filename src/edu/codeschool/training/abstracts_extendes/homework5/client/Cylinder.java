package edu.codeschool.training.abstracts_extendes.homework5.client;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 *( Math.PI * radius * radius) + 2 * (Math.PI *radius * height);
    }

    @Override
    public String getShapeName() {
        return shapeName = "Cylinder";
    }
}
