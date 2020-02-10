package homework5.test;

import homework5.shape.Circle;
import homework5.shape.Rectangle;
import homework5.shape.Shape;
import homework5.shape.Square;

public class TestShape {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(12, 5);
        Rectangle square = new Square(2, 3);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.toString());

    }
}
