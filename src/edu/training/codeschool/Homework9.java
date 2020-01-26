package edu.training.codeschool;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,20]");
        a = scanner.nextInt();
        System.out.println("Enter a integer number from [1,20]");
        b = scanner.nextInt();
        System.out.println("Enter a integer number from [1,20]");
        c = scanner.nextInt();
        System.out.println("Enter a integer number from [1,20]");
        d = scanner.nextInt();
        int sum;
        sum=a+b+c+d;
        int multiply;
        multiply=a*b*c*d;
        System.out.println("sum="+sum);
        System.out.println("multiply="+multiply);
    }
}