package edu.training.codeschool.training.classes_objects.homework4;

import java.util.Random;

public class Circle {
    /**
     * 1.1 The class should have following state and behaviour:
     * Two private instance variables(fields): radius (of the type double) and color (of the type String),
     * with default value of 1.0 and "red", respectively.
     * Three overloaded constructors - a default constructor with no argument,
     * a constructor which takes a double argument for radius, and a constructor which takes a double
     * argument for radius and String argument for color.
     * Three public methods: getRadius(), getArea() and getColor() which return the radius,area and color of this instance, respectively.
     */
    private double radius = 1.0;
    private String color = "red";
    private static final double PI = 3.14;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public double getRadius() {

        return radius;
    }

    public String getColor() {

        return color;
    }

    public double getArea() {
        System.out.print("circle area = ");
        return PI * (getRadius()*getRadius());
    }

}
