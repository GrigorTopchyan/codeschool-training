package edu.codeschool.training.classes_objects.homework4;

public class DateValidator {

    public static boolean validateDate(Date date) {
        if (true) {
            date.dayIsValidate();
            date.monthIsValidate();
            date.yearValidate();
            System.out.println("Is validate");
            return true;


        } else {
            System.out.println("no validate");
        }
        return false;
    }

}
