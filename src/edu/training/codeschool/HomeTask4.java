package edu.training.codeschool;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,9]");
        int number = scanner.nextInt();
        int a = number;
        System.out.println(a + " * 1 = " +a);
        System.out.println(a + " * 2 = " +2*a);
        System.out.println(a + " * 3 = " +3*a);
        System.out.println(a + " * 4 = " +4*a);
        System.out.println(a + " * 5 = " +5*a);
        System.out.println(a + " * 6 = " +6*a);
        System.out.println(a + " * 7 = " +7*a);
        System.out.println(a + " * 8 = " +8*a);
        System.out.println(a + " * 9 = " + 9*a);

    }
}
