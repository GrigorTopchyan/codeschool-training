package com.javalesson.homework2;

import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number =" + i);
            }
            else {
                sum = sum + i;

            }

        }
        System.out.println("Sum =" + sum);

    }
}
