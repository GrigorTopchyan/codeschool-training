package Homework2;

import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {


        int exponent;
        long power = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter the Exponent Value  : ");
        int number = scanner.nextInt();

        System.out.print(" Please Enter the second Exponent Value : ");
        exponent = scanner.nextInt();

        for(int i = 1; i <= exponent; i++)
        {
            power = power * number;
        }
        System.out.println("The Final result of " + number + " power " + exponent + " = " + power);
      }

        }
