package edu.training.codeschool.homework_lesson_6;

import java.lang.reflect.Array;

public class NewArray {
    //??????????????
    public static void main(String[] args) {
        int[] arr1 =  {1,3,6,7,9};
        int[] arr2 = {2,4,5,8};
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[i];
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println(arr3[i]);
        }

    }
}
