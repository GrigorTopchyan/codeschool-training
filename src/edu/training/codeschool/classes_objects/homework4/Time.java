package edu.training.codeschool.classes_objects.homework4;

public class Time {
    public int hour;
    public int minute;
    public static int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        if (hour > 0 & hour < 24) ;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 0 & minute < 60) ;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 0 & second < 60) ;
        this.second = second;
    }

    public void nextSecond(Time time) {
        time.second++;
    }

    public void previusSecond(Time time) {
        time.second--;

    }

    @Override
    public String toString() {
        return "hh:" + hour +
                " mm: " + minute +
                " ss: " + second;
    }
}
