package edu.training.codeschool;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number");
        a = scanner.nextInt();
        if(a%2!=0)
            System.out.println("The number is odd");
        else System.out.println("The number is even");

    }
}