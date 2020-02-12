package edu.codeschool.training.abstracts_extendes.homework5.client;

import java.util.Arrays;

public class Painter {

    public static void paint(Shape shape, String color) {
        double area;
        System.out.println("Painted shape with name : " + shape.shapeName + " with color :" + color + " with area : ");
    }

    public static void paint(Shape[] shapes, String color) {
        //dasin nayecinq gri
        for (int i = 0; i <shapes.length ; i++) {
            Painter.paint(shapes[i],color);
        }
    }


}


