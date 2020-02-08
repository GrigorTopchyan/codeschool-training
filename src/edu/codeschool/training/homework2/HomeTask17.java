package edu.codeschool.training.homework2;

import javax.swing.*;
import java.util.Arrays;

//Write a Java program to find the second largest and second smallest elements in an int array
//                    ex. {4,5,7,8,3} -> 7is second largest element, second smallest 4

public class HomeTask17 {
    public static void main(String[] args) {
        int[] array = {12, 2, 67, 8, 64, 34, 98, 23, 34};
        sortArray(array);
        System.out.println("The second largest element is " + array[1]);
        System.out.println("The second smallest element is " + array[7]);


    }
    public static void sortArray(int [] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
