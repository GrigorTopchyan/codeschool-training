package edu.training.codeschool;

public class Homework2ex6 {
    public static void main(String[] args) {
        double a[];
        double m;
        a = new double[10];
        a[0] = 1.2;
        a[1] = 2.2;
        a[2] = 5.5;
        a[3] = 4.5;
        a[4] = 5;
        a[5] = 7.8;
        a[6] = 8.5;
        a[7] = 7;
        a[8] = 5.1;
        a[9] = 3.15;
        m = (a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6] + a[7] + a[8] + a[9]) / 10;
        System.out.println("average=" + m);
    }
}