package edu.codeschool.training.homework2;

// Write a program that prints the sum of odd numbers from 1 to N number (N = 1_000_000).

public class HomeTask1 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("Sum of odd numbers =" + sum);

    }


}

