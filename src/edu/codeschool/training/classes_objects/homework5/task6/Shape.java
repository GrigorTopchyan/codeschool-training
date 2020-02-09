/*
6.1 Write an abstract class Shape with the following properties:
    An instance variable shapeName of type String
    An abstract method area()
    A toString method that returns the name of the shape
 */


package edu.codeschool.training.classes_objects.homework5.task6;

public abstract class Shape {

    public Shape(String name) {
        this.name = name;
    }

    String name;

    public abstract double area();

    public String toString(){
        return name;
    }


}
