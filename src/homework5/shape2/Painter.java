package homework5.shape2;

import homework5.shape.Shape;
import homework5.shape2.Shape2;

import javax.sound.midi.SoundbankResource;

public class Painter {
    /**
     * Create class Painter which have following behaviour:
     * static paint(Shape shape, String color) which prints on the console the shape name area and the color
     * in this format [Painted shape with name: ? with color: ?, with area: ? ]
     * static paint(Shape [] shapes, String color) method which prints all shapes in above described format
     */


    public static String paint(Shape2 shape, String color) {
        return "[" + "name: " + shape.getShapeName() + ", color: " + color + ", area " + shape.area() + "]";
    }
    public static void paint(Shape2[] shapes,String color){

        for (int i = 0; i <shapes.length ; i++) {
            //karas kanches verevi paint y
            System.out.println(shapes[i].area()+" color: "+color);
        }
    }


}
