package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

    public void Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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
    public String  plusYear(int year) {
        int sumYear = year + getYear();
        return "[" + getDay() + "/" + getMonth() + "/" + sumYear + "]";
    }
   public String plusDay(int day) {
    int sumDay = getDay() + day;
        if (sumDay <= 0 || sumDay > 31) {
    }
        return "[" + sumDay + "/" + getMonth() + "/" + getYear() + "]";
}
    public String toString() {
        return "[" + day + "/" + month + "/" + year + "]";
    }
}





