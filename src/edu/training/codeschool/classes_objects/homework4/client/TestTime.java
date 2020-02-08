package edu.training.codeschool.classes_objects.homework4.client;

import edu.training.codeschool.classes_objects.homework4.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time =new Time(22,45,20);
        System.out.println(time);
        for (int i = 0; i <10 ; i++) {
            time.previusSecond(time);
            System.out.println(time);

        }

    }

}
