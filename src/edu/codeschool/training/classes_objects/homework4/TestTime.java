package edu.codeschool.training.classes_objects.homework4;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time(17,45,59);
        System.out.println(time.toString());
        Time time1 = time.nextSecond();
        System.out.println(time1.toString());
    }
}
