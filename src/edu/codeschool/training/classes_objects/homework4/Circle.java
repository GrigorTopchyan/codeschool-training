package edu.codeschool.training.classes_objects.homework4;

public class Circle {

    private String color;
    private double radius;



    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String color(){
        return color;
    }

    public double radius(){
        return radius;
    }

    public String toString(){
        return radius + color;
    }




}
