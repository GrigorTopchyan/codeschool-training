package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Train;

public class FreightTrain extends Train {
    private double carryingCapacity;

    public FreightTrain(String color, double maxSpeed, double carryingCapacity) {
        super(color, maxSpeed);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Freight train is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Freight train move distance " + distance);
    }

    @Override
    public void stop() {
        System.out.println("Freight train is stopped");
    }


    @Override
    public String toString() {
        return "FreightTrain: "+'\n'+ super.toString() +
                "   Carrying Capacity:" + carryingCapacity+'\n' ;
    }
}