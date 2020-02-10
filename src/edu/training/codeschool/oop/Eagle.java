package edu.training.codeschool.oop;

public class Eagle extends Animal{

    private double wingLenth;

    public Eagle(String name, int age, double wingLenth) {
        super(name, age);
        this.wingLenth = wingLenth;
    }

    public double getWingLenth() {
        return wingLenth;
    }

    public void setWingLenth(double wingLenth) {
        this.wingLenth = wingLenth;
    }

    @Override
    void move() {
        System.out.println("Eegle is moving");
    }
}
