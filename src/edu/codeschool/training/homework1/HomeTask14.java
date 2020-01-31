package edu.codeschool.training.homework1;

import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char b = (char) (c + 32);
        if (c > 64 && c < 91) {
            System.out.println(b);
        }

        char f = (char) (c - 32);
        if (c > 96 && c < 123) {
            System.out.println(f);
        }


    }

}

