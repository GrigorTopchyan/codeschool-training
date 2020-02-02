package edu.codeschool.training.classes_objects.homework4;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        d.setDay(2);
        d.setMonth(2);
        d.setYear(1992);
        System.out.println(d.toString());
        System.out.println(d.plusDay(25));
        System.out.println(d.plusYear(5));

    }
}
