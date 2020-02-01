package edu.codeschool.training.homework2;


import java.util.Arrays;

// Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}.
//                   Write a Java program to copy the array to another array.

public class HomeTask9 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 39, 56, 77, 18, 29, 49};
        int[] anotherArray = new int[array.length];
        System.out.println("Array original ");
        //Երկու for պետք չի մի for ով պիտի գրես
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
            for (int c = array[0]; c <= array.length; c++) {
                anotherArray[c] = array[i];
                System.out.println(anotherArray[c]);
            }
        }
    }
}
