/*
  6.2 Create subclass of Shape with name Circle with the following properties
      private field radius of type double
      Constructor with all parameters
      Override area() method for Circle
 */


package edu.codeschool.training.classes_objects.homework5.task6;

public class Circle extends Shape {


    private double radius;

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }


    public Circle(double radius,String name) {
        super(name);
        this.radius = radius;
    }

}





//    private double radius;
//
//
//
//    public Circle2(double radius) {
//        this.radius = radius;
//    }
//
//    public Circle2() {
//        super();
//    }



