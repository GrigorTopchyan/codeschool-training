package edu.training.codeschool.HomeWork4.Constructors;

public class Date {
    private int day;
    private int month;
    private int year;


    //constructor ches sarqel sarqi
    //validacianer kanes vor mi5akajqic durs chga month[0 - 12), day [0,31]
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    //seter methodneri mej validacianer areq
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