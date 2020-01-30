package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Rectangle;

public class TestRectangle {
    /**
     * 2.2 Create class with name TestRectangle inside edu.codeschool.training.classes_objects.homework4.client packege.
     * Inside main method create three object of type Rectangle with three constructors.
     * print length, width, area and perimeter of these rectangles.
     * Change length and width of third object with setter methods and print length, width, area and perimeter of changed rectangle.
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Rectangle rectangle3 = new Rectangle(3, 6);

        System.out.println("Length = " + rectangle1.getRectLength() + " Width = " + rectangle1.getWidth());
        System.out.println("Area = " + rectangle1.calculateArea() + " Perimeter = " + rectangle1.calculatePerimeter());

        System.out.println("Length = " + rectangle2.getRectLength() + " Width = " + rectangle2.getWidth());
        System.out.println("Area = " + rectangle2.calculateArea() + " Perimeter = " + rectangle2.calculatePerimeter());

        System.out.println("Length = " + rectangle3.getRectLength() + " Width = " + rectangle3.getWidth());
        System.out.println("Area = " + rectangle3.calculateArea() + " Perimeter = " + rectangle3.calculatePerimeter());

        rectangle1.setLength(6.7f);
        rectangle1.setWidth(4.5f);

        rectangle2.setLength(2.4f);
        rectangle2.setWidth(9.3f);

        rectangle3.setLength(5.2f);
        rectangle3.setWidth(3.8f);

        System.out.println("result area and perimeter after change");

        System.out.println("Length = " + rectangle1.getRectLength() + " Width = " + rectangle1.getWidth());
        System.out.println("Area = " + rectangle1.calculateArea() + " Perimeter = " + rectangle1.calculatePerimeter());

        System.out.println("Length = " + rectangle2.getRectLength() + " Width = " + rectangle2.getWidth());
        System.out.println("Area = " + rectangle2.calculateArea() + " Perimeter = " + rectangle2.calculatePerimeter());

        System.out.println("Length = " + rectangle3.getRectLength() + " Width = " + rectangle3.getWidth());
        System.out.println("Area = " + rectangle3.calculateArea() + " Perimeter = " + rectangle3.calculatePerimeter());



    }
}
