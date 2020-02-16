package HomeWork7.HomeTask5;

public class TransportMangement {
    public static void main(String[] args) {
        Transport car=new Car("red",120);
        Car bus= new Bus("white",100);
        Car truck =new Truck("black",80);
        Transport train=new Train("green",30);
        Train innerCity=new InnerCity("black",70);
        Train tram=new Tram("yelow",60);
        Transport boat=new Boat("white",50);
        Transport plane= new Plane("red",40);
        car.move(200);
        bus.start();
        truck.stop();
        train.move(400);
        innerCity.move(500);
        tram.start();
        boat.stop();
        plane.start();
        plane.move(1000);

    }
}
