package com.javalesson.operators;

public class Operators {
    public static void main(String[] args) {

        double a = 15;
        double b = 10;

        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;
        double g = a % b;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
        System.out.println("f =" + f);
        System.out.println("g =" + g);

        a += 5;
        System.out.println("New a =" + a);

        --b;
        System.out.println("New b =" + b);

        double n = 7;
        double m = 7;

        int x = 3;
        int y = 5;
        int z = 7;

        boolean boolVal = n >= m;
        System.out.println("boolVal =" + boolVal);

        boolean boolVal2 = x > z;
        System.out.println("boolVal2 = " + boolVal2);

        boolean resaltBool = boolVal || boolVal2;
        System.out.println("resaltBool = " + resaltBool);


        int res = x < y ? x : y;
        System.out.println("res =" + res);

    }
}
