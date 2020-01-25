package edu.training.codeschool.if_statement;

import java.util.Scanner;

public class SwithchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operation = scanner.next();

        switch (operation){
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            default:
                System.out.println("This calculator does not support " + operation + " operation");
        }
    }
}
