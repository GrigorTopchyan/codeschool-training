package Homework1;

import java.util.Scanner;

public class ClassHomeTask16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator =scanner.next().charAt(0);
        double result=0;
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.printf("Error! operator is not correct");
        }
        System.out.printf( "%.1f %c %.1f = %.1f",first, operator, second, result);
       }
    }

