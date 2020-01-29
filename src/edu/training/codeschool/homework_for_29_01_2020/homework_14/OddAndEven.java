package edu.training.codeschool.homework_for_29_01_2020.homework_14;

import java.util.Scanner;

public class OddAndEven {
    public static int evenNumbers(int min, int max){
        int i = min;
        while (i<max){
            if (i%2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        return i;
    }

    public static int oddSum(int min, int max){
        int i = min;
        int sum = 0;
        while (i<=max){
            if (i%2 == 1){
                sum+=i;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input min : ");
        int min = scanner.nextInt();
        System.out.print("input max : ");
        int max = scanner.nextInt();
        System.out.println(evenNumbers(min,max));
        System.out.println(oddSum(min,max));
    }
}
