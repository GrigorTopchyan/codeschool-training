package edu.codeschool.training.homework2;

import java.util.Arrays;

// Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} and index = 4.
//                   Write a Java program to remove the element with the index from an array.
//                   Print the array before and after removal of the element

public class HomeTask8 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Before remove index four ");
        for (int i = 0; i < array.length; i++) {
            if (i >= 5 && i != array.length - 1) {
                array[i] = array[i + 1];

            }

        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
