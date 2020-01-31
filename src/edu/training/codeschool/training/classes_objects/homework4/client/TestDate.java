package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    /**
     *   4.2 Create TestDate class inside edu.codeschool.training.classes_objects.homework4.client package.
     *                        Inside main method create one date object of type Date which represent the 09.10.1992 date.
     *                        Increase the date by 5 year.
     *                        Increase the date by 25 day.
     *                        Print crieted date object.
     */
    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(2);
        date.setMonth(2);
        date.setYear(1992);
        System.out.println(date.toString());

        System.out.println(date.plusDays(25));
        System.out.println(date.plusYear(5));


    }
}
