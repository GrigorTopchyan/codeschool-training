package edu.training.codeschool.HomeWork4.classes_objects;

public class Circle {

    private double radius = 1.0;
    private String color = "red";
    public Circle(){};
    public Circle(double radius){this.radius=radius; };
    public Circle(double radius, String color){this.radius=radius;
    this.color=color;};

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;

    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", color= " + color +
                ", area=" + getArea() +
                '}';
    }
}