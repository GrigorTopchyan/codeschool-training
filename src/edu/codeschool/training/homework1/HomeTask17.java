package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask17 {
    public static void main(String[] args) {
        double a, b;
        System.out.println("Please check the numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        char c = sc.next().charAt(0);
        b = sc.nextDouble();
        switch (c) {
            case '+':
                System.out.println("a + b = " + (a + b));
                break;
            case '-':
                System.out.println("a - b = " + (a - b));
                break;
            case '*':
                System.out.println("a * b = " + (a * b));
                break;
            case '/':
                System.out.println("a / b = " + (a / b));
                break;
            case '%':
                System.out.println("a % b = " + (a % b));


        }


    }
}
