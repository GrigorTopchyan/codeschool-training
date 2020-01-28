package Homework2;

import java.util.Arrays;

public class HomeTask8 {

    public static void main(String[] args) {

        int [] numbers = {25, 14, 96, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Before removing the fourth element: " + Arrays.toString(numbers));

        int removeIndex = 4;

        for(int i = removeIndex; i < numbers.length -1; i++){
            numbers[i] = numbers[i + 1];
        }

        System.out.println("After removing the fourth element: " + Arrays.toString(numbers));
       }
    }

