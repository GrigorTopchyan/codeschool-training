package edu.codeschool.training.classes_objects.HomeWork7.task5;

public class Plane extends Transport {
    String name;

    public Plane(String color, double maxSpeed, String name) {
        super(color, maxSpeed);
        this.name = name;
    }
    @Override
    public void stop() {
        System.out.println(getColor() + " " + name + " is Stop");
    }
    @Override
    public void start() {
        System.out.println(name + " is Start");
    }
    @Override
    public void move(double distance) {
        System.out.println(name + " is Move " + distance + " mile");

}
}
