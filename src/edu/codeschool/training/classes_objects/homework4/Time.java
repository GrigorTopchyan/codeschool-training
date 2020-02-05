package edu.codeschool.training.classes_objects.homework4;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour > 0 && hour < 23) {
            this.hour = hour;
            System.out.print(hour + ",");
        } else {
            System.out.print("Wrong time ");
        }
        if (minute > 0 && minute < 59) {
            this.minute = minute;
            System.out.print(minute + ",");
        }
        if (second > 0 && second < 59) {
            this.second = second;
            System.out.print(second + ",");
        } else {
            System.out.print("Wrong time ");
        }

    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 23) {
            this.hour = hour;
            System.out.print(hour + ",");
        } else {
            System.out.print("Wrong time ");
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute < 59) {
            this.minute = minute;
            System.out.print(minute + ",");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 0 && second < 59) {
            this.second = second;
            System.out.print(second + ",");
        } else {
            System.out.print("Wrong time ");
        }


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
        }
        if (hour > 23) {
            hour = 0;
        }
        Time time = new Time(this.hour, this.minute, second);
        System.out.println(time);
    }

    public void previousSecond() {
        second = second - 1;
        if (second < 0) {
            second = second + 60;
            this.minute = minute - 1;
        }
        if (minute < 0) {
            minute = minute + 60;
            this.hour = hour - 1;
        }
        if (hour < 0) {
            hour = 23;
        }
        Time time = new Time(this.hour, this.minute, second);
        System.out.println(time);


    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}

