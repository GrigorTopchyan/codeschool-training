package edu.training.codeschool.homework2;

import java.util.Scanner;

public class Homework2ex7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        n = scanner.nextInt();
        int a[];
        int i;
        a = new int[20];
        a[0] = 1;
        a[1] = 25;
        a[2] = 8;
        a[3] = 6;
        a[4] = 4;
        a[5] = 5;
        a[6] = 56;
        a[7] = 55;
        a[8] = 8;
        a[9] = 68;
        a[10] = 45;
        a[11] = 62;
        a[12] = 66;
        a[13] = 82;
        a[14] = 63;
        a[15] = 33;
        a[16] = 3;
        a[17] = 7;
        a[18] = 31;
        a[19] = 32;
        for (i = 0; i <= 19; i++)
            if (n == a[i]) {
                System.out.println("the index=" + i);
                break;
            }
    }
}