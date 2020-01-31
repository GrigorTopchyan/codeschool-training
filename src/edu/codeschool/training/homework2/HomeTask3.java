package edu.codeschool.training.homework2;

import java.util.Scanner;

//.Given two numbers n, m(Input m,n from console). Write a program to find
//                  the value of one number raised to the power of another(m֊ի n աստիճանը).
//                  (Do not use Java built-in method)

public class HomeTask3 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int result = 1;
        for (int i = 0; i < m; i++) {
            result = result * n;
        }
        System.out.println(result);
    }
}
