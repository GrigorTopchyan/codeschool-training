/*
 4.2 Create subclass of Shape with name Circle which contains:
     An instance variable radius (double).
     The no-arg(default) constructor initializes the radius to 1.0.
     Getter and setter for the instance variable radius.
     Methods getArea() and getPerimeter().
     Override the toString() method inherited, to return "A Circle with radius=xxx, which is a subclass of yyy",
      where yyy is the output of the toString() method from the superclass.

 */

package edu.codeschool.training.classes_objects.homework5;

public class Circle1 extends Shape1 {


   private double radius;

   public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle1(){
        super();
        radius = 1.0;
    }


    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }


    public String toString(){
        return "A Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }

}
