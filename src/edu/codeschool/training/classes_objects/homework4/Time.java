package edu.codeschool.training.classes_objects.homework4;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("hour should be 0 - 23");
            System.out.println("minute should be 0 - 59");
            System.out.println("second should be 0 - 59");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }


    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {

            this.second = second;
        }
    }

    public Time nextSecond() {
        int nextSecond = getSecond() + 1;
        if (nextSecond > 59) {
            nextSecond = 0;
        }
        Time time = new Time(this.hour, this.minute, nextSecond);
        return time;
    }

    public Time previousSecond() {
        int previousSecond = getSecond() - 1;
        if (previousSecond < 1) {
            previousSecond = 0;
        }
        Time time = new Time(getHour(), getMinute(), previousSecond);
        return time;
    }

    public String toString() {
       // fornatDigit(hour);
        return "[" + fornatDigit(hour) + ": " + fornatDigit(minute) + ": " + fornatDigit(second) + "]";
    }

    private String fornatDigit(int digit) {
        return digit < 10 ? "0" + digit : "" + digit;
       /* if (digit < 10) {
            return "0" + digit;
        } else {
            return "" + digit;
        }*/
    }
}


