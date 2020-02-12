package edu.training.codeschool.HomeWork4.Constructors;

public class Rectangle {
    private double length;
    private float width;

    //validacianer ara vor bacasakan tiv chkarenan poxancen
    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(float width) {
        this.width = width;
    }

    public Rectangle() {

    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}