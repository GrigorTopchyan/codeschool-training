package edu.training.codeschool.homework_for_29_01_2020.homework_2.recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static int fac(int num){
        if (num == 0){
            return 1;
        }
        else {
            return (num * fac(num-1));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number : ");
        int number = scanner.nextInt();
        System.out.println("the factorial of " + number + " = " + fac(number));
    }
}
