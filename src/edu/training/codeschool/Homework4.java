package edu.training.codeschool;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number from [1,100]");
        a= scanner.nextInt();
        if(a%3==0 && a%7==0)
            System.out.println("yes");
        else System.out.println("no");
    }
}