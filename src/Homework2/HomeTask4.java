package Homework2;

import java.util.Scanner;

public class HomeTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if(n%2 == 0){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }

       }
    }

