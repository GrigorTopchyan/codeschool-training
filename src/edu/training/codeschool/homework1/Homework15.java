package edu.training.codeschool.homework1;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        char l;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter ");
        l = scanner.next().charAt(0);
        n = (int) l;
        if(n>=65 && n<=90)
        { n = n + 32;
        l = (char) n;
        System.out.print( l);}
      else if(n>=97 && n<=122)
        {n = n - 32;
        l = (char) n;
        System.out.print( l);}
        else System.out.println("the imported symbol isn`t letter");
    }
}
