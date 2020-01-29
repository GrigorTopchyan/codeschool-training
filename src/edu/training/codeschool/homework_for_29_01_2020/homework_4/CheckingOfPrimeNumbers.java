package edu.training.codeschool.homework_for_29_01_2020.homework_4;

import java.util.Scanner;

public class CheckingOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number : ");
        int num = scanner.nextInt();
        boolean isPrime;
        if (num<2){
            isPrime = false;
        }
        else {
            isPrime = true;
        }
        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }

    }
}
