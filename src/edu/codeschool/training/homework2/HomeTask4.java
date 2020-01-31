package edu.codeschool.training.homework2;

import java.util.Scanner;

//Given n (Input n from console). Write a program that prints "The number is prime" if the given number is prime,
//                   otherwise it prints "The number is not prime".
//                   (Note that the number is prime if it divides on 1 and on itself)

public class HomeTask4 {
    public static void main(String[] args) {
        int n;
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n <= 0 || n == 1) {
            System.out.println("Is not Prime");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Is not Prime");
        }
    }
}
