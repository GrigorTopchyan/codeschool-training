package edu.codeschool.training.classes_objects.homework4;
//
public class Circle {
    private double radius = 1.0;
    private String color = "Red";
//
    public Circle(){
        System.out.println("Default constructor");
    }
    public Circle(double rad1){
        System.out.println("Constructor with one argument " + rad1);
    }
    public Circle(double rad1,String color){
        System.out.println("Constructor with two arguments are : radius = " + rad1 + " & color is "  + color);
    }

    public void getRadius (){
        this.radius = radius;
        System.out.println("Radius =" + radius);
    }
    public void getColor (){
        this.color = color;
        System.out.println("Color is " + color);
    }
    public void getArea (){
        this.color = color;
        this.radius = radius;
        System.out.println("Area is " + radius + " " + color);


    };
//


}