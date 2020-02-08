package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class Painter {
    public static String paint(Shape shape){
        String something = "Painted shape with name: " + shape.shapeName + " area : " +  shape.area();;
        return something;
    }
    public static void paint(Shape [] shapes){
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}
