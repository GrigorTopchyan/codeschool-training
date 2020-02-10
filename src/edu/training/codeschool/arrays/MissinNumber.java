package edu.training.codeschool.arrays;

//
//Write a Java program to find a missing number in an array. Array numbers are from 1 to n
//        ex. {1,2,3,4,6,7,8,9} 5 is missing
public class MissinNumber {
    public static void main(String[] args) {
        final int n = 9;
        int [] arr = {2,3,6,7,8,1,9,4};
        int sum = 0;
        int sumArray = 0;
//        for (int i = 0; i <= 9; i++) {
//            sum+=i;
//        }

        sum = n *(n + 1)/2 ;
        for (int i = 0; i < arr.length; i++) {
            sumArray+= arr[i];
        }

        System.out.println(sum - sumArray);

    }
}
