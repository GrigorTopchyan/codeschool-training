package edu.training.codeschool.homework_lesson_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewArray {
    //??????????????
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 7, 9};
        int[] arr2 = {2, 4, 5, 8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }

        for (int i = arr1.length, k = 0; i < mergedArr.length; k++,i++) {
            mergedArr[i] = arr2[k];
        }
//
//        for (int i = 0; i <mergedArr.length ; i++) {
//            System.out.println(mergedArr[i]);
//        }
        return mergedArr;
    }
}
