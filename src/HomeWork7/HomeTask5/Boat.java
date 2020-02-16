package HomeWork7.HomeTask5;

public class Boat extends Transport {
    public Boat(String color, double maxSpeed) {
        super(color, maxSpeed);

    }

    @Override
    public void stop() {
        System.out.println("Boat stop ok");
    }

    @Override
    public void start() {
        System.out.println("Boat start ok");
    }

    @Override
    public void move(double distance) {
        System.out.println(distance/maxSpeed+"hour");
    }
}
