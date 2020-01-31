package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {
        System.out.println("Enter for know the number is zero,negative or positive ");
        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();

        if (a < 0) {
            System.out.println("The number is negative");
        }  if (a > 0) {
            System.out.println("THe number is positive");
        }  if (a == 0){
            System.out.println("The number is zero");
        }

            if (a > -1 && a < 1) {
                System.out.println("The number is small");

            }  else if (a < -1000000 && a > 1000000) {
                System.out.println("The number is large");
            }

    }


}
