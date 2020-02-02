package edu.training.codeschool.homework2;

public class HomeTask10 {
    public static void main(String[] args) {
//        10. Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
//        Write a Java program to find the maximum and minimum value of an array.
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = arr[5];
        int min = arr[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];


            }
        }
        System.out.println("The max is " + max);
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }


        }
        System.out.println("The min is " + min);
    }
}
