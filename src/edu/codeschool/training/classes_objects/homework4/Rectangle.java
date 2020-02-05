package edu.codeschool.training.classes_objects.homework4;

//
public class Rectangle {
    private float length = 1.0f;
    private double width = 1.0f;

    //
    public Rectangle(float length) {
    }

    ;

    public Rectangle(double width) {
    }

    ;

    public Rectangle(float length, double width) {
        this.width = width;
        this.length = length;

    }

    ;
//

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calcArea() {
        double calculateArea = length * width;
        System.out.println("Area = " + calculateArea);
        return calculateArea;
    }

    public double calcPerimeter() {
        double calcPerimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter = " + calcPerimeter);
        return calcPerimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width + ", Calculate area = " + calcArea() + ", Calculate perimeter = " + calcPerimeter() +
                '}';
    }
}
