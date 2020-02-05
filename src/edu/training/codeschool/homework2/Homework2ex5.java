package edu.training.codeschool.homework2;

import java.util.Scanner;

public class Homework2ex5 {
    public static void main(String[] args) {
        double i;
        int n;
        double s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++)
            s = s + (1 / i);
        System.out.println("sum=" + s);
    }
}
