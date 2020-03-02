package edu.codeschool.training.cloneAndImmutable.immutable;

public class City implements Cloneable {
    private String name;
    private long countOfResidents;
    private double surface;

    public City(String name, long countOfResidents, double surface) {
        this.name = name;
        this.countOfResidents = countOfResidents;
        this.surface = surface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountOfResidents() {
        return countOfResidents;
    }

    public void setCountOfResidents(long countOfResidents) {
        this.countOfResidents = countOfResidents;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", countOfResidents=" + countOfResidents +
                ", surface=" + surface +
                '}';
    }
}
