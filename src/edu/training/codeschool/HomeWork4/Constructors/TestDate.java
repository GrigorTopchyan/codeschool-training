package edu.training.codeschool.HomeWork4.Constructors;

public class TestDate {
    public static void main(String[] args) {
        //Nuyn el stex sax texery kdzes
        Date date = new Date();
        System.out.println("date created");
        date.setYear(1995);
        date.setMonth(10);
        date.setDay(9);

        date.toString();

        date.toString1();

    }
}