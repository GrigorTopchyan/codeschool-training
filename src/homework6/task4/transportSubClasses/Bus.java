package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Car;

public class Bus extends Car {


    public Bus(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Bus is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Bus move distance "+distance);
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopped");
    }

    @Override
    public String toString() {
        return "Bus: "+'\n'+ super.toString();
    }
}
