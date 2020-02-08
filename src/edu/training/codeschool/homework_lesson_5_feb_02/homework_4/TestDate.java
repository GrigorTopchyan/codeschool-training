package edu.training.codeschool.homework_lesson_5_feb_02.homework_4;

public class TestDate {
    public static void main(String[] args) {
        Date myDate = new Date(1998,12,25);
        myDate.setDay(9);
        myDate.setYear(1955);
        myDate.setMonth(12);
        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getYear());
        System.out.println();
        System.out.println("new updated date\n");

        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getYear());
        System.out.println(myDate);

    }
}
