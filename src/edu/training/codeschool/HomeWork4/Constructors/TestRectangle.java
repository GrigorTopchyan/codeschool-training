package edu.training.codeschool.HomeWork4.Constructors;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle ();
        System.out.println("rectangle created");
        rectangle.setLength(5);
        rectangle.setWidth(2);

        System.out.println("length="+rectangle.getLength());
        System.out.println("width="+rectangle.getWidth());
        System.out.println("perimeter="+rectangle.calculatePerimeter());
        System.out.println("area="+rectangle.calculateArea());

        Rectangle rectangle2 = new Rectangle ();
        System.out.println("rectangle2 created");
        rectangle2.setLength(7);
        rectangle2.setWidth(4);

        System.out.println("length="+rectangle2.getLength());
        System.out.println("width="+rectangle2.getWidth());
        System.out.println("perimeter="+rectangle2.calculatePerimeter());
        System.out.println("area="+rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle ();
        System.out.println("rectangle created");
        rectangle3.setLength(4);
        rectangle3.setWidth(3);

        System.out.println("length="+rectangle3.getLength());
        System.out.println("width="+rectangle3.getWidth());
        System.out.println("perimeter="+rectangle3.calculatePerimeter());
        System.out.println("area="+rectangle3.calculateArea());

    }
}

