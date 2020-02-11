package edu.codeschool.training.abstracts_extendes.homework5;

public class Circle extends Shape {
    double radius = 1.0;

    //xia default constructor
    //parametrov haytarari
    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;

    }
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
