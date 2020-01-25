package edu.training.codeschool.if_statement;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 10 ){
            System.out.println(i + " is greater than 10");
        }else {
            System.out.println(i + " is less than 10");
        }
    }
}
