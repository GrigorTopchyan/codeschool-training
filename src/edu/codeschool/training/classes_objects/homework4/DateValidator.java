package edu.codeschool.training.classes_objects.homework4;

public class DateValidator {

    public static boolean validateDate(Date date) {
        Date date1 = new Date(12,15,1992);
        if (date.getDay()>0 && date.getDay()<=31){
            System.out.println("Is validate");
            return true;
        }
        if (date.getMonth()>0 && date.getMonth()<=12){
            System.out.println("Is validate");
            return true;
        }
        if (date.getYear()>0){
            System.out.println("Is validate");
        }
        else {
            System.out.println("Is not validate");
        }
        return false;
    }

}
