package edu.training.codeschool.HomeWork4.classes_objects;

public class Date {
    private int day ;
    private int month;
    private int year;



    public  Date(int day, int month, int year) {
        if (day > 0 && day < 31) {
            this.day = day;
        } else {
            System.out.println("wrong time");
        }
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println("wrong month");
        }
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("wrong year");
        }


    }


    public int getDay(

    ) {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;
        } else {
            System.out.println(" wrong ");}

    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println(" wrong ");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println(" wrong ");
        }
    }

    public int plusYear(int years) {
        year = year + years;
        return year;
    }

    public void plusDay(int days) {
        this.day = days + this.day;
        if (this.day> 31) {
            this.day =this.day - 31;
            this.month = this.month + 1;
        }

    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

