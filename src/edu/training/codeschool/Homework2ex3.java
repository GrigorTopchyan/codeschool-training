package edu.training.codeschool;

import java.util.Scanner;

public class Homework2ex3 {
    public static void main(String[] args) {
        int i;
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,10]");
        n = scanner.nextInt();
        System.out.println("Enter a integer number from [1,10]");
        m = scanner.nextInt();
        int j = n;
        for (i = 1; i < m; i++)
            n = n * j;
        System.out.println(n);
    }
}
