package edu.training.codeschool.homework_for_29_01_2020.homework_7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TheIndexOfN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number : ");
        int x = scanner.nextInt();
        boolean flag = false;
        int[] arr = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                flag = true;
                System.out.print("the index of array element " + i);
                break;
            }
        }
        if (!flag){
            System.out.println("it is not true");
        }

    }

}
