package homework6.task4.transportSubClasses;


import homework6.task4.abstractTransport.Transport;

public class Truck extends Transport {
    public Truck(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Truck is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Truck move distance "+distance);
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
    }

    @Override
    public String toString() {
        return "Truck: "+'\n'+ super.toString();
    }
}
