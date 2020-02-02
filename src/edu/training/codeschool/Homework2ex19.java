package edu.training.codeschool;

public class Homework2ex19 {
    public static void main(String[] args) {
        int a[];
        int i;
        int m = 0;
        a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 5;
        a[4] = 6;
        a[5] = 7;
        for (i = 0; i < 5; i++)
            if (a[i] + 1 != a[i + 1])
                m = a[i] + 1;
        System.out.println(m+" is missing");
    }
}