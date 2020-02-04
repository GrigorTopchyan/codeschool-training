package edu.training.codeschool.homework1;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
         double n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number ");
        n = scanner.nextDouble();
        if(n==0)
            System.out.println(n+" is equal to zero");
        if(n<0)
            System.out.println(n+" is negative");
        if(n>0)
            System.out.println(n+" is positive");
        if(n<1 && n>0)
            System.out.println(n+" is small");
        if(n>1000000)
            System.out.println(n+" is large");
 }
}
