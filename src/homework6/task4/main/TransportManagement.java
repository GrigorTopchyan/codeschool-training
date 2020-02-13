package homework6.task4.main;

import homework6.task4.abstractTransport.Transport;
import homework6.task4.iveicle.IVehicle;
import homework6.task4.transportSubClasses.*;

public class TransportManagement {
    public static void main(String[] args) {
        Transport cargoAirplane = new CargoAirplane("red",3000,65000);
        Transport passengerPlane = new PassengerPlane("yellow",5000);
        Transport freightTrain = new FreightTrain("green",400,50000);
        Transport bus = new Bus("grey",120);
        Transport  tram = new Tram("black",100);
        Transport sailboat = new Sailboat("white",200,false);
        Transport []  vehicles= {cargoAirplane,passengerPlane,freightTrain,bus,tram,sailboat};
        for (int i = 0; i <vehicles.length ; i++) {
            System.out.println(vehicles[i].toString());
        }



       TransportManager.transportFunction(cargoAirplane,40);
       TransportManager.transportFunction(passengerPlane,60);
       TransportManager.transportFunction(freightTrain,10);
       TransportManager.transportFunction(bus,20);
       TransportManager.transportFunction(tram,55);
       TransportManager.transportFunction(sailboat,45);
    }
}
