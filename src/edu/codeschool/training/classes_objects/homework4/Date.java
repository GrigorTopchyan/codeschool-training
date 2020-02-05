package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (day > 0 && day < 31) {
            this.day = day;

        } else {
            System.out.println("Error 404 :D");
        }
        if (month > 0 && month < 13) {
            this.month = month;

        } else {
            System.out.println("Error 404 :D");
        }
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error 404 :D");
        }
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;

        } else {
            System.out.println("Error 404 :D");
        }

    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;

        } else {
            System.out.println("Error 404 :D");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error 404 :D");
        }
    }


    public void plusYear(int years) {
        year = year + years;

    }

    public void plusDay(int days) {
        day = day + days;
        if (day > 31) {
            day = day - 31;
            month = this.month + 1;


        }


    }

    public void dayIsValidate() {
        if (this.day > 0 && this.day < 31) {
            this.day = day;

        } else {
            System.out.println("Error 404 :D");
        }
    }

    public void monthIsValidate() {
        if (month > 0 && month < 13) {
            this.month = month;

        }
    }

    public void yearValidate() {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error 404 :D");
        }
    }


    @Override
    public String toString() {
        return "Data{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

