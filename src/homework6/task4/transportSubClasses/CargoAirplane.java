package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Plane;

public class CargoAirplane extends Plane {
    private double carryingCapacity;

    public CargoAirplane(String color, double maxSpeed, double carryingCapacity) {
        super(color, maxSpeed );
        this.carryingCapacity=carryingCapacity;
    }



    public double getCarryingCapacity() {
        return carryingCapacity;
    }


    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
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
