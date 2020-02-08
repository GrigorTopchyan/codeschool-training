package HomeWork6;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = 1.0;
        this.length = 1.0;
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
        double a = this.length * this.width;
        return a;
    }

    public double getPerimeter() {
        double p = 2 * (this.width * this.length);
        return p;
    }

    @Override
    public String toString() {
        return "A Rectangle with width" + width +
                ", length=" + length +
                "} " + super.toString();
    }
}
