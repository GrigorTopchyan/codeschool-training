package edu.training.codeschool.HomeWork4.classes_objects;

public class DateValidator {

    public static boolean validateDate(Date date) {

        if (date.getYear() < 0) {
            return false;
        }
        if (date.getMonth() < 0 || date.getMonth() > 12) {
            return false;
        }
        if (date.getDay() < 0 || date.getDay() > 31) {
            return false;
        }return true;
    }


}


