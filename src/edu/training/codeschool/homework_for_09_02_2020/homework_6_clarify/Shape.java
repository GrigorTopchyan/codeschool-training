package edu.training.codeschool.homework_for_09_02_2020.homework_6_clarify;

public abstract class Shape {
    public static String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }



    abstract double area();

    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
