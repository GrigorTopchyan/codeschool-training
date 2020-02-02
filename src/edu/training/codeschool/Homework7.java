package edu.training.codeschool;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number ");
        n = scanner.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is even");
        if (n % 2 != 0)
            System.out.println(n + " is odd");
    }
}
