package edu.training.codeschool.training.classes_objects.homework4;

public class Time {
    /**
     * 6.1 Class should have following state and behaviour: Three private fields
     * hour of type int, hour should be 0 - 23.
     * minute of type int, minute should be 0 - 59
     * second of type int, second should be 0 - 59
     * Create a constructor with an hour, minute and second parameters. Do validation inside constructor
     * Create getter and setter methods for all fields. Do validation inside setter.
     * Create nextSecond() method which creates another object of type Time from existing object
     * with increased second and returns creted object.
     * Create previousSecond() method which creates another
     * object of type Time from existing object and wit decreased second and returns created object.
     * Create toString() method which returns string representation of Time object of this format [hh:mm:ss]
     */
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

        } else {
            System.out.println("hour should be 0 - 23");

        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {

            this.minute = minute;

        } else {
            System.out.println("minute should be 0 - 59");
        }

    }

    public int getSecond() {

        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {

            this.second = second;
        } else {
            System.out.println("second should be 0 - 59");
        }

    }

    public Time nextSecond() {
        int nextSecond = getSecond() + 1;
        if (nextSecond > 59) {
            nextSecond = 0;
        }
        Time time = new Time(getHour(), getMinute(), nextSecond);

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

    @Override
    public String toString() {
        if ((getHour() >= 0 && getHour() < 10) && (getMinute() >= 0 && getMinute() < 10) && (getSecond() >= 0 && getSecond() < 10)) {
            return "[" + "0" + getHour() + ":" + "0" + getMinute() + ":" + "0" + getSecond() + "]";

        } else if (!(getHour() >= 0 && getHour() < 10) && (getMinute() >= 0 && getMinute() < 10) && (getSecond() >= 0 && getSecond() < 10)) {
            return "[" + getHour() + ":" + "0" + getMinute() + ":" + "0" + getSecond() + "]";

        } else if (!(getHour() >= 0 && getHour() < 10) && !(getMinute() >= 0 && getMinute() < 10) && (getSecond() >= 0 && getSecond() < 10)) {
            return "[" + getHour() + ":" + getMinute() + ":" + "0" + getSecond() + "]";

        } else if ((getHour() >= 0 && getHour() < 10) && (getMinute() >= 0 && getMinute() < 10) && !(getSecond() >= 0 && getSecond() < 10)) {
            return "[" + "0" + getHour() + ":" + "0" + getMinute() + ":" + getSecond() + "]";

        } else if (!(getHour() >= 0 && getHour() < 10) && (getMinute() >= 0 && getMinute() < 10) && !(getSecond() >= 0 && getSecond() < 10)) {
            return "[" + getHour() + ":" + "0" + getMinute() + ":" + getSecond() + "]";
        } else if ((getHour() >= 0 && getHour() < 10) && !(getMinute() >= 0 && getMinute() < 10) && (getSecond() >= 0 && getSecond() < 10)) {
            return "[" +"0" + getHour() + ":" + getMinute() + ":" +"0" + getSecond() + "]";
        }else if ((getHour() >= 0 && getHour() < 10) && !(getMinute() >= 0 && getMinute() < 10) && !(getSecond() >= 0 && getSecond() < 10)) {
            return "[" +"0" + getHour() + ":" + getMinute() + ":" + getSecond() + "]";
        } else {
            return "[" + getHour() + ":" + getMinute() + ":" + getSecond() + "]";
        }

    }
}
