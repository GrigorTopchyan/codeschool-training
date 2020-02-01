package edu.training.codeschool.homework2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

//        2. Write a program to print the factorial value of the given N(Input N from console).
//        Please note that N! = 1 * 2 * 3 * ... * N


        Scanner scaner = new Scanner(System.in);
        int N = scaner.nextInt();
        int f = 1;
        for (int i = 1; i <=N; i++) {
            f = f * i;
        }
        System.out.println(f);

    }
}
