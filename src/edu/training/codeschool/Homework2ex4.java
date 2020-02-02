package edu.training.codeschool;

import java.util.Scanner;

public class Homework2ex4 {
    public static void main(String[] args) {
        int i;
        int n;
        boolean a = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        n = scanner.nextInt();
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0)
             a = true;
                if (!a)
                    System.out.println(n + " is prime");
                if (a)
                    System.out.println(n + " is`nt prime");
        }
    }
}

