package homework5.shape;

public class Square extends Rectangle {
    /**
     * 4.4 Create class Square which is a sub class of Rectangle
     * Square has no instance variable, but inherits the instance variables width and length from its superclass Rectangle.
     * Provide the appropriate constructors (as shown in the class diagram). Hint:
     * public Square(double side) {
     * super(side, side);  // Call superclass Rectangle(double, double)
     * }
     * Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy",
     * where yyy is the output of the toString() method from the superclass.
     * Do you need to override the getArea() and getPerimeter()? Try them out.
     * Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.
     */

    public Square(double width, double length) {
        this.setWidth(width);
        this.setLength(width);
    }


    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return this.getLength() * 4;
    }

    @Override
    public String toString() {
        return "A Square with side = " + this.getWidth() + " , which is a subclass of " + super.toString();

    }
}
