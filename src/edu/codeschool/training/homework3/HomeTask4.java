package edu.codeschool.training.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = HomeTask2.arrayFromNumber(a);
        boolean t = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                t = false;
                break;
            }

        }
        if (t) {
            System.out.println("The number is polyndrom");
        } else {
            System.out.println("The number is not polyndrom");
        }
    }
}
