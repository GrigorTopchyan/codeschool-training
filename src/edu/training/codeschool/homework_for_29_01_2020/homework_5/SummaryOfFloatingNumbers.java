package edu.training.codeschool.homework_for_29_01_2020.homework_5;

import java.util.Scanner;

public class SummaryOfFloatingNumbers {
    static double sum(double n){
        double sum = 0;
        for (double i = 1; i <= n ; i++) {
            sum+=(1/i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number : ");
        double num = scanner.nextDouble();
        System.out.println(sum(num));
    }
}
