package edu.codeschool.training.exceptions;


public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }catch (ArithmeticException ex){
            System.out.println("Zero number");
        }
    }
}

