package edu.training.codeschool.homework_lesson_6;

import java.util.Random;

public class SortingOfArray {
    public static void main(String[] args) {
        Random random = new Random();


    int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int abc = random.nextInt(100);
            arr[i] = abc;
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int bub = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bub;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
