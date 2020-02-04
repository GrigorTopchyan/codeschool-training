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
        //ստեղ կամ պիտի լինի ոչ թե և
        if (day > 31 && day < 1) {
            System.out.println("Day can't be > than 31 or < than 1");
        } else {

            this.day = day;
        }
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {
        //ստեղ կամ պիտի լինի ոչ թե և
        if (month > 12 && month < 1) {
            System.out.println("Month can't be > than 12 or < than 1");
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        //ստեղ կամ պիտի լինի ոչ թե և
        //խի չի կարա 0 լինի
        if (year < 1 && year == 0) {
            System.out.println("Year can't be negative or 0");
        } else {
            this.year = year;
        }

    }

    public String plusYear(int year) {

        int sumOfYears = year + getYear();
        //չպիտի վերադարձնես
        //պահանջը ասումա եղած օբյեկտի year ը ավելացնես
        return "[ " + sumOfYears + " / " + getMonth() + " / " + getDay() + " ]";
    }

    public String plusDays(int days) {
        //նույնը սրա համար
        //պիտի ստւգես եթե 30 ից ավել լինի պիտի ամիսները գւմարես
        // նույնը ամիսների համար պիտի ստուգես
        int sumDays = getDay() + days;
        if (sumDays <= 0 || sumDays > 31) {
            System.out.println("Day can't be > than 31 or < than 1");
            return "[ " + 0 + "0" + " / " + 0 + "0" + " / " + 0 + "0" + " ]";
        }
        return "[ " + getYear() + " / " + getMonth() + " / " + sumDays + " ]";

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
