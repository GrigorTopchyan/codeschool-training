package HomeWork6.HomeTask6;

import HomeWork6.HomeTask6.Shape;

public class TestPainter {
    public static void main(String[] args) {
        HomeWork6.HomeTask6.Shape[] shapes =new Shape[3];
        shapes[0]=new Circle("Circle",12);
        shapes[1]=new Rectengle("rectengle",12,12);
        shapes[2]= new Cylinder("Cylinder",12,14);
        Painter.paintArr(shapes,"Red");
    }
}
