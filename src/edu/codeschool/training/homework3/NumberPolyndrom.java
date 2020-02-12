package edu.codeschool.training.homework3;

import java.util.Scanner;

public class NumberPolyndrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = NumbersFromArray.arrayFromNumber(a);
        //անունները լավացրու օրինակ կարար լիներ isPolindrome = true;
        boolean isPolyndrom = true;
        //սխալա աշխատում դզի օրինակ  23432 ասումա The number is not polyndrom
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPolyndrom = false;
                break;
            }

        }
        if (isPolyndrom) {
            System.out.println("The number is polyndrom");
        } else {
            System.out.println("The number is not polyndrom");
        }
    }
}
