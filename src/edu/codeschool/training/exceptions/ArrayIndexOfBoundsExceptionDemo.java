package edu.codeschool.training.exceptions;

public class ArrayIndexOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int [] arr = new int[10];
        try {
            for (int i = 0; i <=arr.length ; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out of index");
        }
    }

}
