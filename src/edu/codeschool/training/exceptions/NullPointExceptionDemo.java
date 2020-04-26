package edu.codeschool.training.exceptions;

public class NullPointExceptionDemo {
    public static void main(String[] args) {
        Object a = null;
        try {
            a.toString();
        }catch (NullPointerException ex){
            System.out.println("Please enter correct name");
        }
    }

}
