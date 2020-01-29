package com.javalesson.homework2;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        int n;
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n <= 0 || n == 1) {
            System.out.println("Is not Prime");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Is not Prime");
        }
    }
}
