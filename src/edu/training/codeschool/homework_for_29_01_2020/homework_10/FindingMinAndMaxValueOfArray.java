package edu.training.codeschool.homework_for_29_01_2020.homework_10;

public class FindingMinAndMaxValueOfArray {
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
     int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("the max value of given array : " + findMax(arr));
        System.out.println("the min value of given array : " + findMin(arr));
    }
}
