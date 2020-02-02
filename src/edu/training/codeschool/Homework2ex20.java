package edu.training.codeschool;

public class Homework2ex20 {
    public static void main(String[] args) {
        int a[];
        int i;
        int average;
        a = new int[6];
        a[0] = 9;
        a[1] = 2;
        a[2] = 3;
        a[3] = 8;
        a[4] = 7;
        a[5] = 1;
        int max = a[0];
        for (i = 0; i < 6; i++)
            if (max < a[i])
                max = a[i];
        int min = a[0];
        for (i = 0; i < 6; i++)
            if (min > a[i])
                min = a[i];
        average = (a[0] + a[1] + a[2] + a[3] + a[4] + a[5] - min - max) / 4;
        System.out.println("average="+average);
    }
}