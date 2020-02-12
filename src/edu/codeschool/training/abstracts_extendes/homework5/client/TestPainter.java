package edu.codeschool.training.abstracts_extendes.homework5.client;

import com.javalesson.controlstatement.Array;

public class TestPainter {
    public static void main(String[] args) {
       Shape [] shapes = {new Circle(12)};
       Shape [] shapes1 = {new Cylinder(15,2)};
       Shape [] shapes2 = {new Rectangle(1,5)};
       Painter.paint(shapes,"Red");
       Painter.paint(shapes1,"Green");
       Painter.paint(shapes2,"Yellow");

    }
}
