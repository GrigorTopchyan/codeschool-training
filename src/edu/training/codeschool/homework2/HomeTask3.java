package edu.training.codeschool.homework2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
//        3.Given two numbers n, m(Input m,n from console). Write a program to find
//        the value of one number raised to the power of another(m֊ի n աստիճանը).
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        Math.pow(a, b);
        System.out.println(Math.pow(a, b));

    }
}
