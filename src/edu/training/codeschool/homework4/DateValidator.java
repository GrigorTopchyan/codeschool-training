package edu.training.codeschool.homework4;

public class DateValidator {
    public static boolean validateDate(Date date){

        if (date.getYear() < 0){
            return false;
        }

        if (date.getMonth() < 0 || date.getMonth() > 31){
            return false;
        }

        return true;
    }
}
