package HomeWork7.HomeTask5;

public class Car extends Transport {
    public Car(String color, double maxSpeed) {
        super(color, maxSpeed);
    }


    @Override
    public void stop() {
        System.out.println("Car stop ok");
    }

    @Override
    public void start() {
        System.out.println("Car start ok");
    }



    @Override
    public void move(double distance) {
        System.out.println(distance/maxSpeed+"hour");

    }
}
