package edu.codeschool.training.HomeWork6.Transport;

import edu.codeschool.training.HomeWork6.Transport.*;

public class TransportManagement {
    public static void main(String[] args) {
        Car BMW = new Car("Blue", 200, "X5");
        Truck kamaz = new Truck("White", 120, "kamaz");
        Bus LondonBus = new Bus("Red", 100, "BusVoyage");
        Train volchonok = new Train("Green", 220, "Volchonok");
        Tram num = new Tram("Black", 100, "Alina");
        InnerCity ret = new InnerCity("Yellow", 180, "Betis");
        Plane big = new Plane("White", 90, "Margarita");
        Boat small = new Boat("Gray", 50, "Barbio");
        BMW.start();
        BMW.move(120);
        BMW.stop();
        kamaz.start();
        kamaz.move(200);
        kamaz.stop();
        LondonBus.start();
        LondonBus.move(120);
        LondonBus.stop();
        volchonok.start();
        volchonok.move(150);
        volchonok.stop();
        num.start();
        num.move(80);
        num.stop();
        big.start();
        big.move(300);
        big.stop();
        small.start();
        small.move(150);
        small.stop();

    }
}
