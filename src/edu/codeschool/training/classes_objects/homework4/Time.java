package edu.codeschool.training.classes_objects.homework4;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

    }

    ;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Wrong time ");
        } else {
            System.out.println(hour);
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            System.out.println("Wrong time ");
        } else {
            System.out.println(minute);
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            System.out.println("Wrong time ");
        } else {
            System.out.println(second);
            this.second = second;
        }



        }
    }
