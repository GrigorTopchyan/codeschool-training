/*
 4.4 Create class Square which is a sub class of Rectangle
     Square has no instance variable, but inherits the instance variables width and length from its superclass Rectangle.
     Provide the appropriate constructors (as shown in the class diagram). Hint:
     public Square(double side) {
     super(side, side);  // Call superclass Rectangle(double, double)
     Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy",
     where yyy is the output of the toString() method from the superclass.
     Do you need to override the getArea() and getPerimeter()? Try them out.
     Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.

 */


package edu.codeschool.training.classes_objects.homework5;

public class Square extends Rectangle1 {

    public Square(double width, double length) {
        super(width, length);
    }
    public Square(double side){
        super(side, side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    private double getSide() {
        return super.getWidth();
    }

    public void setLength(double length){
        length = 1.0;
    }

    public void setWidth(double width){
        width = 2.0;


    }

}


