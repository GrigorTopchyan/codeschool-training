package edu.codeschool.training.homework3;

import java.util.Arrays;

public class HomeTask5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 7, 9, 65};
        int[] array3 = {2, 4, 5, 8, 11, 25, 84};
        int length = array1.length + array3.length;
        int [] newArray = new int[length];
        int j = 0;
        int k = 0;
        for (int i = 0; i <array1.length ; i++) {
            newArray[i] = array1[j];
            j++;
            }
        for (int i = array1.length; i <length ; i++) {
            newArray[i] = array3[k];
            k++;
        }
        HomeTask5.sortArrayMinToMax(newArray);
        System.out.println(Arrays.toString(newArray));

        }public static void sortArrayMinToMax(int [] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    }

