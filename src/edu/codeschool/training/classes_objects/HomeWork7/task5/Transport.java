package edu.codeschool.training.classes_objects.HomeWork7.task5;

public class Transport implements Vehicle {
    private String color;
    private double maxSpeed;
    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed (double maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    @Override
    public void stop() {
    }
    @Override
    public void start() {
    }
    @Override
    public void move(double distance) {

    }
}
