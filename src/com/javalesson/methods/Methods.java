package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Alex");

        int a = 5;
        int b = 10;
        int rectangeSquare = calcRectangleSquare(a, b);
        int square = calcSquare(b);
        System.out.println("Rectangle square =" + calcRectangleSquare(a, b));
        System.out.println("Square =" + square);

        System.out.println("Sum of squares =" + (calcRectangleSquare(a, b) + square));
    }

    static void printMessage(String name) {
        System.out.println("Hello World" + name + "!!");

    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
