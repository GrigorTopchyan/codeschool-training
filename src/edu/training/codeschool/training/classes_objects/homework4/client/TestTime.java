package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Time;

public class TestTime {
    /**
     * 6.2 Create class with name TestTime in edu.codeschool.training.classes_objects.homework4.client package.
     *                           Inside main method create object of type Time.
     *                           Print the created object.
     *                           Increase the time by one second.
     *                           Print the object again.
     *
     */

    public static void main(String[] args) {
        Time time = new Time(5,15,0);
        Time time2 = new Time(5,11,59);


       Time time0 = time.nextSecond();
       Time time1 = time2.previousSecond();

        System.out.println(time0.toString());
        System.out.println(time1.toString());


    }
}
