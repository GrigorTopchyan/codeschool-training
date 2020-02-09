package edu.codeschool.training.classes_objects.homework6.task6;

public abstract class Shape {

    public Shape(String name) {
        this.name = name;
    }
    String name;
    public abstract double area();
    public String toString() {
        return name;
    }
}
