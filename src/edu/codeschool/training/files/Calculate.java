package edu.codeschool.training.files;

import java.util.Scanner;
import java.lang.System;

public class Calculate {
    public static void calculate(){
        int first,next;
        String symbol;
        Scanner sc = new Scanner(System.in);
        first = sc.nextInt();
        symbol = sc.next();
        next = sc.nextInt();
        switch (symbol){
            case "+" :
                int a = first + next;
                System.out.println(first + " + " + next + " = " + a);
                return;
            case "-" :
                int b = first - next;
                System.out.println(first + " - " + next + " = " + b);
                return;
            case "*" :
                int c = first * next;
                System.out.println(first + " * " + next + " = " + c);
                return;
            case "/":
                int d = first / next;
                System.out.println(first + " / " + next + " = " + d);

        }
    }
}
