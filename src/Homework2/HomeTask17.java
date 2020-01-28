package Homework2;

import java.util.Scanner;

public class HomeTask17 {

    public static void main(String[] args) {


        int n = 0;
        int g;
        int[] number = {2, 4, 5, 6, 7};

        for (int i = 0; i < number.length; i++)
            for (int j = i + 1; j < number.length; j++)
                if (number[i] > number[j]) {
                    g = number[i];
                    number[i] = number[j];
                    number[j] = g;
                }

        System.out.println("Second Largest:" + number[number.length - 2]);
        System.out.println("Smallest:" + number[0]);
    }
}
