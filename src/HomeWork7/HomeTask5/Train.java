package HomeWork7.HomeTask5;

public class Train extends Transport {
    public Train(String color, double maxSpeed) {
        super(color, maxSpeed);
    }



    @Override
    public void stop() {
        System.out.println("Train stop ok");
    }

    @Override
    public void start() {
        System.out.println("Train start ok");
    }

    @Override
    public void move(double distance) {
        System.out.println(distance/maxSpeed+"hour");
    }
}
