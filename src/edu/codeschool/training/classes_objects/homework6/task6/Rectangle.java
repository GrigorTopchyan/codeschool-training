package edu.codeschool.training.classes_objects.homework6.task6;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height,String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
