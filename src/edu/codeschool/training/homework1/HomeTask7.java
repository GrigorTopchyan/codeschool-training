package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a % 5 == 0 || a % 6 == 0) {
            System.out.println("Result is true");
        } else {
            System.out.println("True is true");
        }


        //    and

        if (a % 5 == 0 || a % 6 == 0) {
            System.out.println("Result is true");
        }
        if (a % 5 != 0 || a % 6 != 0) {
            System.out.println("Result is false");
        }


    }


}
