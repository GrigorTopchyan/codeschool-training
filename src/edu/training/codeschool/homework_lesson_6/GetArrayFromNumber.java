package edu.training.codeschool.homework_lesson_6;

import java.util.Arrays;

public class GetArrayFromNumber {
    public static void main(String[] args) {
        int a = 514;
        int num;
        int counter  = 0;
        int[] arr = new int[10];
        int i = 0;
        while (a>0){
        num = a%10;
        counter++;
        a = a/10;

            arr[i] = num;
            i++;
        }

        for (int j = counter-1; j >= 0 ; j--) {
            System.out.println(arr[j]);
        }

    }
}
