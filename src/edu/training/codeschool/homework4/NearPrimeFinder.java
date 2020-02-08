package edu.training.codeschool.homework4;

import java.util.Scanner;

public class NearPrimeFinder {

    public static int find(int inputNumper) {
        int i = 1;
        while (true) {
            if (isPrime(inputNumper + i)) {
                return inputNumper + i;
            }
            i++;
        }
    }


    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int primeNumber = find(i);
        System.out.println(primeNumber);
    }
}
