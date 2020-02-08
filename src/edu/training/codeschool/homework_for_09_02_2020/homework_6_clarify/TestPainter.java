package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class TestPainter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("uxxankyun", 10,20);
        System.out.println(Painter.paint(rectangle));
        Shape [] shapes = {new Rectangle("C1",10, 20), new Circle("Klor", 10),new Cylinder("kon", 10,14)};
        Painter.paint(shapes);

    }
}
