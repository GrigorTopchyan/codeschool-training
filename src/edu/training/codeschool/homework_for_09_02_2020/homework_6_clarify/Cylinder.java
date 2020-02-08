package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    public double area(){
        return Math.PI * height * radius*radius;
    }

}
