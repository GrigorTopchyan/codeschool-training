package edu.codeschool.training.abstracts_extendes.homework5;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle(double side, double v) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area = length * width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 *(width * length);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "} " + super.toString();
    }
}
