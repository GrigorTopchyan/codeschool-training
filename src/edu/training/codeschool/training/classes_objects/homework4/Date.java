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

        if (year < 1 ) {
            System.out.println("Year can't be negative or 0");
        } else {
            this.year = year;
        }

    }

    public void plusYear(int year) {

        int sumOfYears = this.year + year;

        System.out.println(sumOfYears);;
    }

    public void plusDays(int days) {

        int sumDays = this.day + days;
        if (sumDays <= 0 || sumDays > 30) {
            System.out.println("Day can't be > than 31 or < than 1");

        }
        if (sumDays>30){
          this.month++;
        }
        System.out.println("[ " + year + " / " + month + " / " + day + " ]");

    }


    @Override
    public String toString() {
        if (getDay() >= 1 && getDay() < 10 && getMonth() >= 1 && getMonth() < 10) {
            return "[ " + getYear() + " / " + "0" + getMonth() + " / " + "0" + getDay() + " ]";
        } else if (!(getDay() >= 1 && getDay() < 10) && (getMonth() >= 1 && getMonth() < 10)) {
            return "[ " + getYear() + " / " +"0"+ getMonth() + " / "  + getDay() + " ]";
        } else if ((getDay() >= 1 && getDay() < 10) && !(getMonth() >= 1 && getMonth() < 10)) {
            return "[ " + getYear() + " / " + getMonth() + " / "+"0" + getDay() + " ]";
        }else {
            return "[ " + getYear() + " / " + getMonth() + " / " + getDay() + " ]";
        }
    }
}