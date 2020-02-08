package edu.training.codeschool.HomeWork4.classes_objects;

public class TestDateValidator {
    public static void main(String[] args) {
        Date date = new Date(34, 43, -1212);
        System.out.println(DateValidator.validateDate(date));
    }
}
