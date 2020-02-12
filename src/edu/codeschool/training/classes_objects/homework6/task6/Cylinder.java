package edu.codeschool.training.classes_objects.homework6.task6;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height, String name) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
