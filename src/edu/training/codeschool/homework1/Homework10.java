package edu.training.codeschool.homework1;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        a = scanner.nextInt();
        System.out.println("Enter a integer number from [1,100]");
        b = scanner.nextInt();
        System.out.println("Enter a integer number from [1,100]");
        c = scanner.nextInt();
        System.out.println("Enter a integer number from [1,100]");
        d = scanner.nextInt();
        System.out.println("Enter a integer number from [1,100]");
        e = scanner.nextInt();
        int sum= a+b+c+d+e;
        int average= sum/5;
        System.out.println("sum="+sum);
        System.out.println("average="+average);
    }
}