package edu.training.codeschool;

import java.util.Scanner;

public class HomerTask10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int num1 = in.nextInt();
        System.out.print("Input number: ");
        int num2 = in.nextInt();
        System.out.print("Input number: ");
        int num3 = in.nextInt();
        System.out.print("Input number: ");
        int num4 = in.nextInt();

        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + (num1 + num2 + num3 + num4));
        System.out.println(num1 + "*" + num2 + "*" + num3 + "*" + num4 + "=" + (num1 * num2 * num3 * num4));
    }
}
