package edu.codeschool.training.classes_objects.homework4;

import java.util.Scanner;

public class MyMath {

    //պիտի ամեն պահանաջի համար մեթոդ սարքեիր որ կստանան արայը որպես պարամետեր
    //փոխի մեթոդներով սարքի
    public static void main(String[] args) {

        int[] arr = {23, 34, 25, 67, 34, 2, 456, 76};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element of massiv is :" + min);
        System.out.println("Max element of massiv is: " + max);

        System.out.println();

        double[] arrays = {3.4, 5.6, 7.5, 1.2, 9.5};
        double min2 = arrays[0];
        double max2 = arrays[0];
        for (double array : arrays) {
            if (array < min) {
                min2 = array;
            }
            if (array > max2) {
                max2 = array;
            }
        }
        System.out.println("Minimum element of the type double is : " + min2);
        System.out.println("Maximum element of the type double is : " + max2);


        System.out.println();

        int[] numbers = {23, 34, 2, 34, 56};
        int sum = 0;
        for (int number : numbers) {
            sum = number + sum;
        }
        System.out.println("Sum of array elements is :" + sum);


        double[] doubles = {23.3, 34.5, 2.3, 4.5};
        double sum2 = 0;
        for (double d : doubles) {
            sum2 += d;
        }
        System.out.println("Sum of double elements is :" + sum2);


        System.out.println();


        int[] arrays2 = {2, 5, 3, 1, 6};
        int mull = 1;
        for (int i = 0; i < arrays2.length ; i++) {
            mull *= arrays2[i];
        }
        System.out.println("Multiplication of array elements is :"+ mull);



        double [] arrays3 = {2.3, 3.4, 9.4, 1.2};
        double mull3 = 1;
        for (int i = 0; i < arrays3.length; i++) {
            mull3 = mull3 * arrays3[(int)i];
        }

        System.out.println("Multiplication of double elements is :"+ mull3);


        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        if(number % 2 != 0){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }

           }

        }


