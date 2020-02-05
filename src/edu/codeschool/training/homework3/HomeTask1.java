package edu.codeschool.training.homework3;

import edu.codeschool.training.classes_objects.homework4.MyMath;

public class HomeTask1 {
    public static void main(String[] args) {
        System.out.println(HomeTask1.isNumberPrime(11));

    }
public static boolean isPrime (int number) {
    boolean t;
    for (int i = 2; i <= number / 2; i++) {
        if (number % i != 0) {
            t = true;
        }break;
    }return true;
}
    public static boolean isNumberPrime(int number) {
        int i = 1;
        while (true) {
            if (HomeTask1.isPrime(number + i)) {
                System.out.println(number + i);

            }
            for (int j = number; j >number + 1 ; j++) {

            }break;
        }
        return true;
    }

}