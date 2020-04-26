package edu.codeschool.training.exceptions;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object a = Integer.valueOf(5);

        try {
            String b = (String) a;
        } catch (ClassCastException ex) {
            System.out.println("Please correct cast");
        }
    }
}
