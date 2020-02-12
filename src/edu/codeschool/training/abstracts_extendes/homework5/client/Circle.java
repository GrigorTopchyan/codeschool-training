package edu.codeschool.training.abstracts_extendes.homework5.client;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getShapeName() {
        return shapeName = "Circle";
    }
}
