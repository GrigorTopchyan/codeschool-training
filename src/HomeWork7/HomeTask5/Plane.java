package HomeWork7.HomeTask5;

public class Plane extends  Transport {
    public Plane(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void stop() {
        System.out.println("Plane stop ok");
    }

    @Override
    public void start() {
        System.out.println("Plane start ok");
    }

    @Override
    public void move(double distance) {
        System.out.println(distance/maxSpeed+"hour");
    }
}
