package edu.codeschool.training.homework2;


import java.util.Arrays;

// Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}.
//                   Write a Java program to copy the array to another array.

public class HomeTask9 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 39, 56, 77, 18, 29, 49};
        int[] anotherArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            anotherArray[i] = array[i];
        }
        System.out.println("Array original is " + Arrays.toString(array));
        System.out.println("Array copy is " + Arrays.toString(anotherArray));

    }
}

