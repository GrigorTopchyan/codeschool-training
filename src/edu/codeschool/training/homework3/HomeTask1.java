package edu.codeschool.training.homework3;

import edu.codeschool.training.classes_objects.homework4.MyMath;

public class HomeTask1 {
    public static void main(String[] args) {
        System.out.println(HomeTask1.nextNumberPrime(8));

    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int nextNumberPrime(int number) {
        int i = 1;
        while (true) {
            if (HomeTask1.isPrime(number + i)) {
                return number + i;
            }
            i++;
        }
    }
}