package edu.codeschool.training.classes_objects.homework4;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time(17,45,0);
        Time time1 = time.nextSecond();
        Time time2 = time.previousSecond();
        System.out.println(time2.toString());
        System.out.println(time1.toString());


    }
}
