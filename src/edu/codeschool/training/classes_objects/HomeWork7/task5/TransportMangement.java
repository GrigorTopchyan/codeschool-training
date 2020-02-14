package edu.codeschool.training.classes_objects.HomeWork7.task5;

public class TransportMangement {

    public static void main(String[] args) {
        Car MercedesBenz = new Car("black", 350, "G500");
        Truck MAN = new Truck("white", 120, "MAN");
        Bus LondonBus = new Bus("blue", 120, "HIGER");
        Train volchonok = new Train("Green", 220, "Volchonok");
        Tram num = new Tram("RED", 80, "ANM");
        InnerCity ret = new InnerCity("Yellow", 180, "M");
        Plane big = new Plane("White", 650, "RYANAIR");
        Boat small = new Boat("White", 70, "TROPHY");
        MercedesBenz.start();
        MercedesBenz.move(120);
        MercedesBenz.stop();
        MAN.start();
        MAN.move(100);
        MAN.stop();
        LondonBus.start();
        LondonBus.move(120);
        LondonBus.stop();
        volchonok.start();
        volchonok.move(150);
        volchonok.stop();
        num.start();
        num.move(90);
        num.stop();
        big.start();
        big.move(350);
        big.stop();
        small.start();
        small.move(100);
        small.stop();
    }
}
