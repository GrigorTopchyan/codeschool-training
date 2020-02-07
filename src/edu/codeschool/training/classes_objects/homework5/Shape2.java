/*
6.1 Write an abstract class Shape with the following properties:
    An instance variable shapeName of type String
    An abstract method area()
    A toString method that returns the name of the shape
 */


package edu.codeschool.training.classes_objects.homework5;

public abstract class Shape2 {

    String shapeName;

    public abstract void area();

    public String toString(){
        return shapeName;
    }


}
