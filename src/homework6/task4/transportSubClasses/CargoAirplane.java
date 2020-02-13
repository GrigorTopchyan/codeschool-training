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
    public void start() {
        System.out.println("Cargo Airplane is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Cargo Airplane move distance "+distance);
    }

    @Override
    public void stop() {
        System.out.println("Cargo Airplane is stopped");
    }

    @Override
    public String toString() {
        return "CargoAirplane: "+'\n' +  super.toString() +
                "   Carrying Capacity:" + carryingCapacity+'\n' ;
    }
}
