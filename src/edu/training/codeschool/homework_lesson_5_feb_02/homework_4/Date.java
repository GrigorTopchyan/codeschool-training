package edu.training.codeschool.homework_lesson_5_feb_02.homework_4;

public class Date {

    private int day;

    private int month;

    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    int getDay() {
        if (day <= 31) {
            return day;
        }
        month += day / 31;
        return day % 31;
    }

    void setDay(int day) {
        this.day = day;
    }

    int getMonth() {
        if (month <= 12) {
            return month;
        }
        year += month / 12;
        return month % 12;
    }

    void setMonth(int month) {
        this.month = month;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    public int plusYear(int year) {
        this.year = getYear() + year;
        return this.year;
    }

    public int plusDay(int day) {
        this.day = getDay() + day;
        return this.day;
    }

    public String toString() {
            return ("[ " + year + "/" + formated(month) + "/" + formated(day) + " ]");
    }

    private String formated(int date) {
        return date < 10 ? "0" + date : String.valueOf(date);
    }

}
