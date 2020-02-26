package edu.codeschool.training.cloneAndImmutable;

public class City implements Cloneable {
    private String name;
    private long countOfResidents;
    private double surface;

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
}
