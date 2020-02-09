package edu.codeschool.training.classes_objects.homework6.task6;

public class Circle extends Shape {

        private double radius;

    public Circle(String name) {
        super(name);
    }

    @Override

        public double area() {
            return Math.PI * (radius * radius);
        }
    public Circle(double radius,String name) {
        super(name);
        this.radius = radius;
    }

}
