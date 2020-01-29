package com.javalesson.homework2;

import java.util.Scanner;

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
