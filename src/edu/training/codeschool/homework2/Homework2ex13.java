package edu.training.codeschool.homework2;

import java.util.Scanner;

public class Homework2ex13 {
    public static void main(String[] args) {
        int i;
        int n;
        int m;
        int s1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        n = scanner.nextInt();
        System.out.println("Enter a integer number from [1,100]");
        m = scanner.nextInt();
        if (n > m)
            for (i = m++; i <= n; i++) {
                if (i % 2 == 0)
                    s1 = s1 + i;
                if (i % 2 != 0)
                    System.out.println(i);
            }
        if (m > n)
            for (i = n++; i <= m; i++) {
                if (i % 2 == 0)
                    s1 = s1 + i;
                if (i % 2 != 0)
                    System.out.println(i);
                ;
            }
        System.out.println("even numbers sum=" + s1);
    }
}
