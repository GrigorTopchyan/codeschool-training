package edu.codeschool.training.exceptions;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
       try {
           Integer.valueOf("a");
       }catch (NumberFormatException ex){
           System.out.println("Please enter correct number");
       }
    }
}
