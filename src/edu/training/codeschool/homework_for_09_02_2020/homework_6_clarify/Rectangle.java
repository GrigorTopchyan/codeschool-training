package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width*height;
    }

}
