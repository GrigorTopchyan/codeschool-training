package edu.codeschool.training.classes_objects.homework4;

public class DateValidator {

    int year,month, day;

    public void validator(Date date) {

        if (year > 0)
            System.out.println("Year is valid");
        if (month < 1 || month > 12)
            System.out.println("Month is valid");
        if (day < 1 || day > 31)
            System.out.println("Date is valid");


    }


}






