package Homework2;

import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {


        int c, f = 1;
        System.out.println("Enter an integer to calculate its factorial :");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 0) {
        }else{
                for (c = 1; c <= i; c++)
                    f = f * c;

                System.out.println("Factorial of " + i + " is = " + f);
            }

        }
    }
