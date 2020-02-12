package edu.training.codeschool.homework_for_09_02_2020.homework_4;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
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
        return length * width;
    }
    public double getPerimeter(){
        return 2*length + 2*width;
    }
    //es methody animasa
    public String getSuperString(){
        return super.toString();
    }

    public String toString(){
        return "A rectangle with width = " + width + ", length = " + length + " which is a subclass of " + getSuperString();
    }
}
