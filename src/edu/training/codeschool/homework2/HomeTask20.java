package edu.training.codeschool.homework2;

public class HomeTask20 {
    public static void main(String[] args) {
//        20.  Write a Java program to find a missing number in an array. Array numbers are from 1 to n
//        ex. {1,2,3,4,6,7,8,9} 5 is missing
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1)
                System.out.println(arr[i] - 1);

        }

    }
}
