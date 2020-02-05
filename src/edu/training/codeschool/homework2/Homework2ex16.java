package edu.training.codeschool.homework2;

public class Homework2ex16 {
    public static void main(String[] args) {
        int a[];
        int i;
        a = new int[6];
        a[0] = 9;
        a[1] = 2;
        a[2] = 3;
        a[3] = 8;
        a[4] = 6;
        a[5] = 1;
        int max = a[1];
        //Սենց ամենամեծն ես գտել պիտի երկրորդ ամենամեծը գտնես
        for (i = 1; i < 6; i++)
            if (max < a[i])
                max = a[i];
        System.out.println("second largest element=" + max);
        int min = a[0];
        //Սենց ամենափոքրն ես գտել պիտի երկրորդ փոքրը գտնես
        for (i = 0; i < 5; i++)
            if (min > a[i])
                min = a[i];
        System.out.println("second smallest element=" + min);


    }
}
