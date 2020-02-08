package homework5.shape;

public class Rectangle extends Shape {
    /**
     * 4.3 Create subclass of Shape with name Rectangle which contains:
     * wo instance variables width (double) and length (double).
     * Three constructors as shown. The no-arg constructor initializes the width and length to 1.0.
     * Getter and setter for all the instance variables.
     * Methods getArea() and getPerimeter().
     * Override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz,
     * which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
     */
    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }

}
