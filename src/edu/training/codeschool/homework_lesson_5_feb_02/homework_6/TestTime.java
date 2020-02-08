package edu.training.codeschool.homework_lesson_5_feb_02.homework_6;

public class TestTime {

    public static void main(String[] args) {
        Time firstTime = new Time(25, 12, 15);
        Time secondTime = firstTime.nextSecond();


        System.out.println(secondTime);
    }
}
