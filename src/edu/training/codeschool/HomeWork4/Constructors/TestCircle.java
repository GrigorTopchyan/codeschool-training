package edu.training.codeschool.HomeWork4.Constructors;

public class TestCircle {

    public static void main(String[] args) {
        //Constructor ov poxanci arjeqnery
        Circle circle = new Circle ();
        System.out.println("circle created");
        circle.setRadius(1);
        circle.setColor("red");

        System.out.println("radius="+circle.getRadius());
        System.out.println("color="+circle.getColor());
        System.out.println("area="+ (circle.getRadius() *3.14)* circle.getRadius());

        Circle circle2 = new Circle ();
        System.out.println("circle 2 created");
        circle2.setRadius(3);
        circle2.setColor("yellow");

        System.out.println("radius="+circle2.getRadius());
        System.out.println("color="+circle2.getColor());
        System.out.println("area="+ circle2.getRadius()*circle2.getRadius()*3.14);

        Circle circle3 = new Circle ();
        System.out.println("circle 3 created");
        circle3.setRadius(2);
        circle3.setColor("green");

        System.out.println("radius="+circle3.getRadius());
        System.out.println("color="+circle3.getColor());

        System.out.println("area="+ (circle3.getRadius()*3.14)*circle3.getRadius());
    }
}
