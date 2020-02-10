package homework5.test;

import homework5.shape.Shape;
import homework5.shape2.*;

public class Shape2Test {
    public static void main(String[] args) {
        Shape2[] shapes = new Shape2[3];
        shapes[0]=new Cylinder("Cylinder",2,3);
        shapes[1]=new Rectangle("Rect",4,9);
        shapes[2]= new Circle("Circle",5);
        Painter.paint(shapes,"Yellow");

    }
}
