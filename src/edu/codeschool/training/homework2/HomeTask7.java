package edu.codeschool.training.homework2;

import java.util.Scanner;

//Given array = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32} and n(Input n from console).
//                   Write a Java program that prints the index of the n if the array contains the specific value.
//                   Otherwise prints "The array does not contain the value"

public class HomeTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean t = true;
        int[] array = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32};
        for (int i = 0; i < array.length; i++) {
            if (t = array[i] == n)
                return;


        }
        System.out.println("The array does not contain the value");

    }
}

