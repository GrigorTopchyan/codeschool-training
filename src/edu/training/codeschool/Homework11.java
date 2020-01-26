package edu.training.codeschool;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,120]");
        int a = scanner.nextInt();
        int m=a*17/100;
        System.out.println("m="+m);
    }
}
