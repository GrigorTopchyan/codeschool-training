package edu.codeschool.training.abstracts_extendes.homework5.client;

public abstract class Shape {
    String shapeName;

    public abstract void area();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
