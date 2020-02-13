package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Plane;

public class PassengerPlane extends Plane {
    public PassengerPlane(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Passenger Airplane is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Passenger Airplane move distance "+distance);
    }

    @Override
    public void stop() {
        System.out.println("Passenger Airplane is stopped");
    }

    @Override
    public String toString() {
        return "PassengerPlane: "+'\n'+ super.toString();
    }
}
