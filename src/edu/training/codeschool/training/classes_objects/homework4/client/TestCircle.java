package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Circle;

public class TestCircle {
    /**
     * 1.2 Create class with name TestCircle in edu.codeschool.training.classes_objects.homework4.client package.
     *                    Inside main method create three objects of type Circle with three constructors.
     *                    For each object print radius, area and color.
     *
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle("Green");
        System.out.println(circle2.getColor());
        Circle circle3 = new Circle(34.5);
        System.out.println(circle3.getRadius());
    }
}
