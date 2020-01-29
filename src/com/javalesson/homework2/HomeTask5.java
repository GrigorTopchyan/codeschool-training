package com.javalesson.homework2;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        double a = 1, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        for (double i = 1; i <= n; i++) {
            sum = sum +a/i;


        }
        System.out.println("Sum =" + sum);
    }
}
