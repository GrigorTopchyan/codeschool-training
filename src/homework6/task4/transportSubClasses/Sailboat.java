package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Boat;

public class Sailboat extends Boat {
    public Sailboat(String color, double maxSpeed, boolean hasEngine) {
        super(color, maxSpeed, hasEngine);
    }

    @Override
    public void start() {
        System.out.println("Sailboat starts with the wind");
    }

    @Override
    public void move(double distance) {
        System.out.println("Sailboat distance " + distance);
    }

    @Override
    public void stop() {
        System.out.println("Sailboat is stopped using an anchor");
    }

    @Override
    public String toString() {
        return "Sailboat: "+'\n' + super.toString();
    }
}
