package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("The digit divides onto 3 and 7");
        } else {
            System.out.println("The digit doesn't divide onto 3 and 7");
        }

        // and
        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("The digit divides onto 3 and 7");
        }
        if (a % 3 != 0 && a % 7 != 0) {
            System.out.println("The digit doesn't divide onto 3 and 7");
        }

    }
}
