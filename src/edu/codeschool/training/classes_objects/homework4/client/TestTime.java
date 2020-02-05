package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time(0, 0, 0);
        time1.nextSecond();
        time1.previousSecond();

    }
}
