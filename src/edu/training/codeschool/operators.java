package edu.training.codeschool;

public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - c;
        int e = a / b;
        int f = a * b;
        int g = a % b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("g=" + g);
        a = a + 5;

        double m = 7;
        double n = 7;
        double result = 2 * n++;
        double result1 = 2 * ++m;
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);

    }
}
