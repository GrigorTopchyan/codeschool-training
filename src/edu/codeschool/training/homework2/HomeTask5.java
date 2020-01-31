package edu.codeschool.training.homework2;

import java.util.Scanner;

// Write a program to calculate the sum of following series where n(Input n from console).
//                   1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n

public class HomeTask5 {
    public static void main(String[] args) {
        double a = 1, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        for (double i = 1; i <= n; i++) {
            sum = sum + a / i;


        }
        System.out.println("Sum =" + sum);
    }
}
