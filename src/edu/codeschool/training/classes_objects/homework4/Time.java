package edu.codeschool.training.classes_objects.homework4;

public class Time {


    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second) {
        int mHour = hour;
        hour = 23*60*60;
        this.hour = mHour;

        int mMinute = minute;
        minute = 59*60;
        this.minute=mMinute;

        int mSecond = second;
        second = 59*60*60;
        this.second = mSecond;
        }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
       hour = 23;
       this.hour = hour;
    }


    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        minute = 59;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        int mSecond = second;
        second = 59;
        this.second = second;
    }



    }

