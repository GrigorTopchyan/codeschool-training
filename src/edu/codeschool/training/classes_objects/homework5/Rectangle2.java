/*
  6.4 Create subclass of Shape with name Rectangle with the following properties.
      private field width of type double
      private field height of type double
      Constructor with all parameters
      override area() method

 */

package edu.codeschool.training.classes_objects.homework5;

public class Rectangle2 extends Shape2{


    private double width;
    private  double height;


    public Rectangle2(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double area = height * width;
        System.out.println("The area of circle is: " + area);

    }

    public Rectangle2(){
        super();
        double rectangle2 = height * width;

    }

}
