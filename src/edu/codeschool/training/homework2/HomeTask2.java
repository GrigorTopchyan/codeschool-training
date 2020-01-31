package edu.codeschool.training.homework2;

import java.util.Scanner;

// Write a program to print the factorial value of the given N(Input N from console).
//                   Please note that N! = 1 * 2 * 3 * ... * N

public class HomeTask2 {
    public static void main(String[] args) {
        int n;
        long result = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Result = " + result);

    }
}
