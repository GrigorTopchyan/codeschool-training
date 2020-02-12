package edu.codeschool.training.HomeWork6.Transport;

public class Transport implements Vehicle {
    String color;
    double maxSpeed;

    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void stop() {
        System.out.println(" is Stop");
    }

    @Override
    public void start() {

    }

    @Override
    public void move(double distance) {

    }
}
