package edu.codeschool.training.classes_objects.homework4;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(11f,8f);
        Rectangle rectangle1 = new Rectangle(11,8);
        rectangle.getLength();
        rectangle.getWidth();
        rectangle.setLength(11);
        rectangle.setLength(8);
        rectangle1.calcArea(11,8);
        rectangle1.calcPerimeter(11,8);
    }
}
