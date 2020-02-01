package edu.codeschool.training.classes_objects.homework4;

public class TestRectangle {

    public static void main(String[] args) {



        Rectangle rectangle1 = new Rectangle(0.2f, 3.4f);
        Rectangle rectangle2 = new Rectangle(0.3f, 2.4f);
        Rectangle rectangle3 = new Rectangle(0.6f, 4.4f);



        System.out.println("Area of Rectangle for 1 object : " + rectangle1.calculateArea());
        System.out.println("Area of Rectangle for 2 object : " + rectangle2.calculateArea());
        System.out.println("Area of Rectangle for 3 object : " + rectangle3.calculateArea());


        System.out.println();


        System.out.println("Perimeter of Rectangle for 1 object : " + rectangle1.calculatePerimeter());
        System.out.println("Perimeter of Rectangle for 2 object : " + rectangle2.calculatePerimeter());
        System.out.println("Perimeter of Rectangle for 3 object : " + rectangle3.calculatePerimeter());


    }
}
