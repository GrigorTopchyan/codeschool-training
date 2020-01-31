package edu.codeschool.training.homework2;

//Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
//                    Write a Java program to find the maximum and minimum value of an array.
public class HomeTask10 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }


        }
        System.out.println("Maximum number of Array = " + max);


        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Minimum number of Array = " + min);
    }

}

