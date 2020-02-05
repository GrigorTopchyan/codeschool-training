package edu.codeschool.training.classes_objects.homework4;

//
public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    //
    public Circle() {
    }

    public Circle(double radius) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;

    }
};
//

