package edu.codeschool.training.classes_objects.homework6.task6;

public class Circle extends Shape {

    private double radius;

    public Circle(String name) {
        super(name);
    }

    @Override

    public double area() {
        //circle i makeresy havasar e Pi * r * r /2
        return Math.PI * (radius * radius);
    }

    //constructory gri nor methodnery
    //sxal chi bayc yndunvac deva
    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

}
