package edu.training.codeschool.training.classes_objects.homework4;

public class Date {
    /**
     * 4.1 The class should have following state and behaviour:
     * Three private instance variables(fields): day, month, year of type int.
     * getter and setter methods for all fields
     * plusYear(int year) method which increase the date object by given year
     * plusDay(int days) method which increase the date object by given days
     * crate toString() method which returns string representation of the Date int this format: Date [yyyy/mm/dd]
     */
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 31 || day < 1) {
            System.out.println("Day can't be > than 31 or < than 1");
        } else {

            this.day = day;
        }
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1) {
            System.out.println("Month can't be > than 12 or < than 1");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year == 0) {
            System.out.println("Year can't be negative or 0");
        } else {
            this.year = year;
        }

    }

    public String plusYear(int year) {

        int sumOfYears = year + getYear();
        return "[ " + sumOfYears + " / " + getMonth() + " / " + getDay() + " ]";
    }

    public String plusDays(int days) {
        int sumDays = getDay() + days;
        if (sumDays > 31 || sumDays < 1) {
            System.out.println("Day can't be > than 31 or < than 1");
            return "[ " + 0 + "0" + " / " + 0 + "0" + " / " + 0 + "0" + " ]";
        }
        return "[ " + getYear() + " / " + getMonth() + " / " + sumDays + " ]";

    }


    @Override
    public String toString() {
        if (getDay() > 0 && getDay() < 10 && getMonth() > 0 && getMonth() < 10) {
            return "[ " + getYear() + " / " + 0 + "" + getMonth() + " / " + 0 + "" + getDay() + " ]";
        }
        return "[ " + getYear() + " / " + getMonth() + " / " + getDay() + " ]";
    }
}
