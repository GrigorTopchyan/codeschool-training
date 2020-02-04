package edu.training.codeschool.homework2;

public class Homework2ex15 {
    public static void main(String[] args) {
        int a[];
        int b[];
        int i;
        int j;
        b = new int[6];
        a = new int[6];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;

        b[0] = 8;
        b[1] = 7;
        b[2] = 2;
        b[3] = 4;
        b[4] = 11;
        b[5] = 23;
        for (i = 0; i < 6; i++)
            System.out.println(a[i]);
        System.out.println(" ");
        for (i = 0; i < 6; i++)
            System.out.println(b[i]);
        for (i = 0; i < 6; i++)
            for (j = 0; j < 6; j++)
                if (a[i] == b[j])
                    System.out.println("Common value is: " + a[i]);
    }
}
