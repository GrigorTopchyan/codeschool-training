package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;


    public int getDay() {
        return day;
    }

    public void setDay(int i) {
        if (day > 31 && day < 1) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int i) {
        if (month > 12 && month < 1) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int i) {
        if (year < 1 && year == 0) {
            this.year = year;
        }
    }

    public String plusYear(int year) {
        int sumOfYears = year + getYear();
        return "[ " + sumOfYears + " / " + getMonth() + " / " + getDay() + " ]";
    }

    public String plusDay(int day) {
        int sumDays = getDay() + day;
        if (sumDays <= 0 || sumDays > 31) {
            System.out.println("Day can't be > than 31 or < than 1");
            return "[ " + 0 + "0" + " / " + 0 + "0" + " / " + 0 + "0" + " ]";
        }
        return "[ " + getYear() + " / " + getMonth() + " / " + sumDays + " ]";
    }

   // public String toString() {

  //  }
}





