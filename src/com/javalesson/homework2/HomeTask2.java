package com.javalesson.homework2;

import java.util.Scanner;

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
