package edu.codeschool.training.classes_objects.HomeWork7.task1;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        int[] arr = {5, 6, 64, 66, 75, 10, 9};

        System.out.println("Index = "  + ArraysUtil.findIndex(arr, 64));
        System.out.println("Array reverse "+ Arrays.toString(ArraysUtil.reverseArr(arr)));
        System.out.println("Array sort "+ Arrays.toString(ArraysUtil.sort(arr)));
        System.out.println("Convert int to String "+Arrays.toString(ArraysUtil.toString(arr)));
        System.out.println("Second large number = "+ArraysUtil.findSecond(arr));
        System.out.println("Double all elements from array "+Arrays.toString(ArraysUtil.doubleArray(arr)));
        System.out.println("Find value of array "+ArraysUtil.contains(arr,10));
    }
}
