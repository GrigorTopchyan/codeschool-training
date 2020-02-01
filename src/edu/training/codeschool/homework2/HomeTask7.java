package edu.training.codeschool.homework2;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
//        7. Given array = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32}
////        and n(Input n from console).
////        Write a Java program that prints the index of the n if the array contains the specific value.
////        Otherwise prints "The array does not contain the value"


        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        int[] array = {1, 25, 8, 6, 4, 5, 56, 55, 8, 68, 45, 62, 66, 82, 63, 33, 3, 7, 71, 32};
        //i < array.length ոչ թէ i < array.length - 1
        for (int i = 0; i < array.length - 1; i++) {
            if (scan == array[i]) {
                System.out.println(i);
            }
            //էսի պիտի for ից դուրս լինի
            System.out.println("The array does not contain the value");
            //Էս break ի տեղն էլա սխալ դու պիտի break անես երբ գտել ես
            break;
        }

    }

}
