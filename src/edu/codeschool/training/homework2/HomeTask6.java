package edu.codeschool.training.homework2;

// Given array = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15}.
//                   Write a Java program to calculate the average value of array elements.

public class HomeTask6 {
    public static void main(String[] args) {
        double sum = 0;
        double sumOfAverageValue = 1;
        double[] array = {1.2, 2.2, 5.5, 4.5, 5, 7.8, 8.5, 7, 5.1, 3.15};
        for (int i = 0; i < array.length; i++) {
            sum = (sum + array[i]);
            sumOfAverageValue = sum / array.length;

        }
        System.out.println(sumOfAverageValue);

    }


}
