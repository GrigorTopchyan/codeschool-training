package com.javalesson.homework2;

public class HomeTask1 {
    public static void main(String[] args) {


        // Write a program that prints the sum of odd numbers from 1 to N number (N = 1_000_000).

        int sum = 0;
        for (int i = 1; i < 1_000_00; i++){
           if (i % 2 != 0)
           sum +=i;
        }
        System.out.println("Sum of odd numbers =" + sum);

    }


}

