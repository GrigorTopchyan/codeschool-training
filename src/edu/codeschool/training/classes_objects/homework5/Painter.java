/*
 6.5 Create class Painter which have following behaviour:
   static paint(Shape shape, String color) which prints on the console the shape name area and the color in this format
    [Painted shape with name: ? with color: ?, with area: ? ]
  static paint(Shape [] shapes, String color) method which prints all shapes in above described format

 */


//                 GOG JAN ESI CHHASKACA VONC ANEM !!!

package edu.codeschool.training.classes_objects.homework5;

import java.awt.*;

public class Painter {

    public static String paint(Shape shape, String color) {
        return  "[Painted shape with name :" + shape +  "with color :"+ color + "with area :]";
    }

}

