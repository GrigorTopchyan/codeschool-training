package edu.training.codeschool.homework2;

public class HomeTask1 {
    public static void main(String[] args) {
        //        1. Write a program that prints the sum of odd numbers from 1 to N number(N = 1000_000).
        int N = 1000000;
        int sum = 0;
        for (int a = 1; a < N; a++)
            if (a % 2 != 0) {
                sum += a;
            }
        System.out.println("The sum of odd numbers are " + sum);
    }
}

