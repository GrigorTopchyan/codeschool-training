package homework6.task4.main;

import homework6.task4.abstractTransport.Transport;
import homework6.task4.iveicle.IVehicle;

public abstract class TransportManager {
    public static void transportFunction(Transport vehicle, double distance){
        System.out.println("----------------------------------------");
        vehicle.start();
        vehicle.move(distance);
        vehicle.start();
//        System.out.println("----------------------------------------");
    }



}
