package HomeWork7.HomeTask5;

public abstract class Transport implements Vehicle {
    public String color;
    public double maxSpeed;

    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
