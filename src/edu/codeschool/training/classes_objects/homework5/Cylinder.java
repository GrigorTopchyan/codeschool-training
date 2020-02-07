/*
  6.3 Create subclass of Shape with name Cylinder with the following properties.
     private field radius of type double
     private field height of type double
     Constructor with all parameters
     override area method(the area of cylinder = PI * height * radius^2)
 */


package edu.codeschool.training.classes_objects.homework5;

import static java.lang.Math.PI;

public class Cylinder extends Shape2 {



    private double radius;
    private double height;


    @Override
    public void area() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("The area of Cylinder is: " + area);
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

        public Cylinder() {
        super();
   }










}


//    private double radius;
//    private double height;
//
//    public Cylinder() {
//        super();
//       double cylinder = 2 * Math.PI * radius * (radius + height);
//    }
//
//    public Cylinder(double radius, double height) {
//        this.radius = radius;
//        this.height = height;
//









