package edu.codeschool.training.classes_objects.homework5.task6;

public class Painter {
public static void paint(Shape shape,String color){
    System.out.println("name: " + shape.name + " Color: " + color
            + " area:  " + shape.area());
}

    public static void paint(Shape [] shapes,String color){
        for (int i = 0; i <shapes.length ; i++) {
           paint(shapes[i],color);
        }
    }
}
