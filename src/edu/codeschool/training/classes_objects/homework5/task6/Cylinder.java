/*
  6.3 Create subclass of Shape with name Cylinder with the following properties.
     private field radius of type double
     private field height of type double
     Constructor with all parameters
     override area method(the area of cylinder = PI * height * radius^2)
 */


package edu.codeschool.training.classes_objects.homework5.task6;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height,String name) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}









