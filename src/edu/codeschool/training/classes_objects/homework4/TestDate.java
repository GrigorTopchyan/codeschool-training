package edu.codeschool.training.classes_objects.homework4;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(1);
        date.setMonth(12);
        date.setYear(1992);
        System.out.println(date.toString());

       System.out.println(date.plusDay(25));
        System.out.println(date.plusYear(5));


    }
}
