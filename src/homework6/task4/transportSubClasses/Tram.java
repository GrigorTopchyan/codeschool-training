package homework6.task4.transportSubClasses;

import homework6.task4.abstractTransport.Train;

public class Tram extends Train {


    public Tram(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Tram is started");
    }

    @Override
    public void move(double distance) {
        System.out.println("Tram move distance "+distance);
    }

    @Override
    public void stop() {
        System.out.println("Tram Airplane is stopped");
    }

    @Override
    public String toString() {
        return "Tram: "+'\n' + super.toString();
    }
}
