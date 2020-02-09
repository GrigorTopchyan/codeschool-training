/*
  6.4 Create subclass of Shape with name Rectangle with the following properties.
      private field width of type double
      private field height of type double
      Constructor with all parameters
      override area() method

 */

package edu.codeschool.training.classes_objects.homework5.task6;

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
