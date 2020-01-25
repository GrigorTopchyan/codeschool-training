package edu.training.codeschool.if_statement;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 10 ){
            System.out.println(i + "is greater than 10");
        }
        System.out.println("I'm not in if statement block");
    }
}
