package edu.training.codeschool.homework_for_12_02_2020.homework_1;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] arr = {2,5,1,23,45,564,12,1,23,34,46,14};
        int[] arr2 = {13, 123, 45};
        System.out.println(ArraysUtil.findIndex(arr, 14));
        System.out.println(ArraysUtil.secondMax(arr));
        System.out.println(ArraysUtil.check(arr, 14));
       // System.out.println(ArraysUtil.concatenateTwoArrays(arr, arr2));
        System.out.println(Arrays.toString(ArraysUtil.doubleArray(arr)));
        System.out.println(ArraysUtil.toString(arr));
        System.out.println(Arrays.toString(ArraysUtil.reverseArr(arr)));
    }
}
