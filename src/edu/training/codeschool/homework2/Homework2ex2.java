package edu.training.codeschool.homework2;

import java.util.Scanner;

public class Homework2ex2 {
    public static void main(String[] args) {

    int i;
    int q=1;
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a integer number from [1,10]");
    n = scanner.nextInt();
    for(i=1;i<=n;i++)
        q=q*i;
    System.out.println(n+"!="+q);
}
}