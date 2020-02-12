package edu.codeschool.training.HomeWork6.Transport;

public class Boat extends Transport {
    String name;

    public Boat(String color, double maxSpeed, String name) {
        super(color, maxSpeed);
        this.name = name;
    }

    @Override
    public void stop() {
        System.out.println(color + " " + name + " is Stop");
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
