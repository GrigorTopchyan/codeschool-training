package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}