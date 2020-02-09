package edu.codeschool.training.classes_objects.homework6.task6;

public class TestPainter {
    public static void main(String[] args) {
     Shape [] shapes = new Shape[3];
    shapes[0] = new Circle(54,"Circle");
    shapes[1] = new Rectangle(2,3,"Rectangle");
    shapes[2] = new Cylinder(84,43,"Cylinder");

        Painter.paint(shapes,"RED");
    }
}
