package Homework2;

import java.util.Arrays;

public class HomeTask11 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int[] numbers2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println(Arrays.toString(numbers2));

    }
   }

