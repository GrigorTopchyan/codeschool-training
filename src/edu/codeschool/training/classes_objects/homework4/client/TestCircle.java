package edu.codeschool.training.classes_objects.homework4.client;


import edu.codeschool.training.classes_objects.homework4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle def = new Circle();
        Circle cons1 = new Circle(12);
        Circle cons2 = new Circle(1.7, "Red");
        System.out.println("Color is " + cons2.getColor() + "\nRadius is" + cons2.getRadius() + "\nArea is" + cons2.getArea());


    }

}