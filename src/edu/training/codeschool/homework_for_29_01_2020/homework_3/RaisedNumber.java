package edu.training.codeschool.homework_for_29_01_2020.homework_3;

import java.util.Scanner;

public class RaisedNumber {
    static int calc(int n, int m){
        int number = 1;
        for (int i = 1; i <= m; i++) {
            number *= n;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number : ");
        int n = scanner.nextInt();
        System.out.print("input the raised number : ");
        int m = scanner.nextInt();
        System.out.println(calc(n,m));
    }
}
