package Homework1;

import java.util.Scanner;

public class ClassHomeTask14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = scanner.nextInt();


        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
         }

    }

