package edu.training.codeschool.homework_for_12_02_2020.homework_1;

import java.util.Arrays;

public class ArraysUtil {
    public static int[] concatenateTwoArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        for (int i = 0; i< arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = arr2.length, k = 0; i < mergedArray.length; i++, k++) {
            mergedArray[i] = arr2[k];
        }
        return mergedArray;
    }

    public static int findIndex(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int[] reverseArr(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0, k = arr.length-1; i < arr.length; i++, k--) {
            temp[i] = arr[k];
        }
        return temp;
    }

    public static String toString(int[] arr){
        return Arrays.toString(arr);
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        return arr;
    }

    public static int secondMax(int[] arr){
        int second = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                second = max;
                max = arr[i];
            }else if (arr[i] > second) {
                second = arr[i];

            }
        }
        return second;
    }

    public static int[] doubleArray(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = (arr1[i]*2);
        }
        return arr2;
    }

    public static boolean check(int[] arr, int element){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                flag = true;
            }
        }
        if (flag){
            return true;
        }
        else {
            return false;
        }
    }


}
