package edu.codeschool.training.homework2;

// Write a Java program to compute the average value of an array of integers except the largest and smallest values

public class HomeTask21 {
    public static void main(String[] args) {
        int[] array = {55, 77, 59, 6, 74, 15, 21, 23, 66, 10};
        int temp;
        int sum = 0;
        int avValOfInt;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }


        }
        for (int k = 1; k < array.length - 1; k++) {
            sum = sum + k;


        }
        avValOfInt = sum / (array.length - 2);
        System.out.println("The average value of an array of integers is  " + avValOfInt);

        //chem karum haskanam xi chi ashxatum,indz tvuma logikan jishta


    }


}
