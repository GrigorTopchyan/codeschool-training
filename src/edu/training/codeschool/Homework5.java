package edu.training.codeschool;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number");
        a = scanner.nextInt();
        if (a % 5 == 0 || a % 6 == 0)
            System.out.println("yes");
        else System.out.println("no");
    }
}