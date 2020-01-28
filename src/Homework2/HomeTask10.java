package Homework2;

import java.util.Arrays;

public class HomeTask10 {

    public static void main(String[] args) {

        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Arrays.sort(numbers);
        System.out.println("Minimum number is :" + numbers[0]);
        System.out.println("Maximum number is :" + numbers[numbers.length-1]);
        }
    }
