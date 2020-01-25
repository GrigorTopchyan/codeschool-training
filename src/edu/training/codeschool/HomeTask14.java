package edu.training.codeschool;

import java.util.Scanner;

public class HomeTask14 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int num1 = in.nextInt();
        if (num1% 2 != 0) {
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }

    }
}
