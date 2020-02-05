package edu.training.codeschool.HomeWork4.Constructors;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int plusYear() {
        return year + 5;
    }

    public int plusDay() {
        return day + 25;
    }

    public String toString() {
        System.out.println("[" + getYear() + "/" + getMonth() + "/" + getDay() + "]");
        return null;
    }

    public String toString1() {
        System.out.println("[" + plusYear() + "/" + getMonth() + "/" + plusDay() + "]");
        return null;
    }
}