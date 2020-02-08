package edu.training.codeschool.homework_for_09_02_2020.homework_4;

public class Circle extends Shape {
    private double radius;

    Circle(){
        radius = 1;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String getSuperString(){
        return super.toString();
    }
    public String toString(){
        return "A Circle with radius = " + radius + ", which is a subclass of " + getSuperString();
    }
}
