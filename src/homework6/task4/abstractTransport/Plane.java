package homework6.task4.abstractTransport;

public abstract class Plane extends Transport {

    public Plane(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }


}
