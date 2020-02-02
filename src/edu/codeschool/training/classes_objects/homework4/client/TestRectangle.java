package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Rectangle;
//
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10f);
        Rectangle r2 = new Rectangle(7d);
        Rectangle r3 = new Rectangle(10,7);
        r1.getLength();
        r1.getWidth();
        r2.getLength();
        r2.getWidth();
        //
        r1.setLength(10);
        r2.setLength(7);
        r1.setWidth(10);
        r2.setWidth(7);
        r3.calcArea(10,7);
        r3.calcPerimeter(10,7);
    }


}
