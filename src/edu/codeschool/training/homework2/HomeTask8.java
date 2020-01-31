package edu.codeschool.training.homework2;

import java.util.Arrays;

// Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} and index = 4.
//                   Write a Java program to remove the element with the index from an array.
//                   Print the array before and after removal of the element

public class HomeTask8 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] array1 = new int[10];
        System.out.println("Before remove index four ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");


        }
        System.out.println();
        System.out.println("After remove index four");
        for (int c = array1[4]; c <= array1.length - 1; c++) {
            array[c] = array[c + 1];
            System.out.print(Arrays.asList(c) + ",");

        }


    }
}
