package homework6.task4.abstractTransport;

import homework6.task4.iveicle.IVehicle;

/**
 *  Create abstract class with name Transport, Transport should implement Vehicle interface and has
 *               color of type String, maxSpeed of type double
 */
public abstract class Transport implements IVehicle {
    private String color;
    private double maxSpeed;


    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
