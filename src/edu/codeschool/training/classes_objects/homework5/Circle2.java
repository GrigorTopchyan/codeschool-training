/*
  6.2 Create subclass of Shape with name Circle with the following properties
      private field radius of type double
      Constructor with all parameters
      Override area() method for Circle
 */


package edu.codeschool.training.classes_objects.homework5;

public class Circle2 extends Shape2 {


    private double radius;

    @Override
    public void area() {
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
    }


    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2() {
        super();
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



