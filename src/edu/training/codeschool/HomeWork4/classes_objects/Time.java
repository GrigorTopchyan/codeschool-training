package edu.training.codeschool.HomeWork4.classes_objects;

public class Time {
    private int hour = (1);
    private int minute = (2);
    private int second = (3);

    public Time(int hour, int minute, int second) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {
            System.out.println("false time");
        }
        if (minute <= 59 && minute >= 0) {
            this.minute = minute;
        } else {
            System.out.println("false time");
        }
        if (second <= 59 && second >= 0) {
            this.second = second;
        } else {
            System.out.println("false time");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else System.out.println("false hour");

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <= 59 && minute >= 0) {
            this.minute = minute;
        } else System.out.println("false minute");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second <= 59 && second >= 0) {
            this.second = second;
        } else System.out.println("false second");
    }

    public void nextSecond() {
        second += 1;
        if (second > 59) {
            second = second - 60;
            this.minute = minute + 1;
            }

            if (minute > 59) {
                minute = minute - 60;
                this.hour = hour + 1;
            } if(hour>23){hour=0;}
            Time time = new Time(this.hour, this.minute, second);
            System.out.println(time);
    }

    public void previousSecond() {
        second -= 1;
        if (second < 0) {
            second = second + 60;
            this.minute = minute - 1;
        }

        if (minute < 0) {
            minute = minute + 60;
            this.hour = hour - 1;
        }if(hour<0){hour=23;}
        Time time = new Time(this.hour, this.minute, second);
        System.out.println(time);
    }






    @Override
    public String toString() {
        return "Time[" + hour +
                ":" + minute +
                ":" + second +
                ']';
    }
}

