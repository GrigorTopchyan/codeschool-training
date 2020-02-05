package edu.training.codeschool.if_statement;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i < 100 ){
            System.out.println(i + " is less than 100");
            if (i > 50) {
                System.out.println( i + " is greater than 50 ");
            }
            if (i % 3 == 0){
                System.out.println(i + " divides on 3 ");
                if (i % 7 == 0){
                    System.out.println(i + " divides on 3 and 7");
                }
            }
        }
    }
}
