package edu.training.codeschool.HomeWork4.classes_objects;

public class TestDate {
    public static void main(String[] args) {
        Date x = new Date(25, 11, 1992);
        x.plusDay(25);
        x.plusYear(5);
        Date y = new Date(12,12,1212);
        y.plusDay(12);
        System.out.println(x.toString());
    }
}
