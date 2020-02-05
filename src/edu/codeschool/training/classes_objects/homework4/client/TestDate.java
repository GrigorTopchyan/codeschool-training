package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    public static void main(String[] args) {

        Date testData = new Date(9, 10, 1992);
        testData.plusDay(25);
        testData.plusYear(5);
        System.out.println(testData);

    }
}
