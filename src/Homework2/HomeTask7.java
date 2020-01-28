package Homework2;

import java.util.Scanner;

public class HomeTask7 {

    public static void main(String[] args) {

        int[] num = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68,
                45, 62, 66, 82, 63, 33, 3, 7, 71, 32};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number");
        int toFind = scanner.nextInt();

        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
       }

    }

