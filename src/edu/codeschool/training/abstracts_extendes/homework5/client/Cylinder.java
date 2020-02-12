package edu.codeschool.training.abstracts_extendes.homework5.client;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void area() {
        double areaOfCylinder = Math.PI * height * radius * radius;
        //petq chi tpel methody menak makeresy veradrcnelu hamara patasxanatu
        System.out.println("Area of Cylinder = " + areaOfCylinder);
    }
}
