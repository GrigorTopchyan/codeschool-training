package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public class Painter {
    //methody color paraqmeter el piti stana
    public static String paint(Shape shape){
        String something = "Painted shape with name: " + shape.shapeName + " area : " +  shape.area();;
        return something;
    }

    //karas miangamic verevi methody kanches
    public static void paint(Shape [] shapes){
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}
