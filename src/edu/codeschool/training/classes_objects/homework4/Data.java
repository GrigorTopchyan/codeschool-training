package edu.codeschool.training.classes_objects.homework4;

public class Data {
    private int day;
    private int month;
    private int year ;

    public Data(int day, int month, int year) {
    }



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

    public int plusYear(int years) {
        years = years + year;
        return years;
    }

    public int plusDay(int days) {
        days = days + year;
        return days;
    }


    public String toString() {
        return "Data[ " + year + "/" + month + "/" + day + ']';
    }
}
