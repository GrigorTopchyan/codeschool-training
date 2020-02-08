package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }


    public double area(){
        return 2*Math.PI*radius;
    }

}
