package edu.codeschool.training.classes_objects.homework4;

public class Circle {
    //Պիտի default արժեքներ տաս
    private double radius;
    private String color;

    //Չի պահանջվում default constructor սարքես
    public Circle() {
        radius = 1.0;
        color = "red";
    }
        public Circle (double r) {
            radius = r;
            color = "red";
            Object area;
        }
    public double getRadius(){
        return radius;
    }

    //Շրջանագծի մակերեսը պիտի հաշվես  s = (Pi * r *r)/2
    public void getArea() {
        return;
    }

    public String getColor() {
        return color;
    }
}
