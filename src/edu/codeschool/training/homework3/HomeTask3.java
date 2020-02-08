package edu.codeschool.training.homework3;

import edu.codeschool.training.homework2.HomeTask17;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random() * 100);
        }
        HomeTask17.sortArray(arr);
        System.out.println(Arrays.toString(arr));


    }


}


