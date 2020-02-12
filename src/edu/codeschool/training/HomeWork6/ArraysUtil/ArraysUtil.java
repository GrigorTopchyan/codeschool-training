package edu.codeschool.training.HomeWork6.ArraysUtil;

import java.util.Arrays;

public class ArraysUtil {
    static int[] constantToArrays(int[] array, int[] array1) {
        int length = array1.length + array.length;
        int[] constantArray = new int[length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            constantArray[i] = array1[j];
            j++;
        }
        for (int i = array1.length; i < length; i++) {
            constantArray[i] = array[k];
            k++;
        }
        System.out.println(Arrays.toString(constantArray));
        return constantArray;
    }

    static void findIndex(int[] array, int element) {
        boolean t = true;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                t = true;
                System.out.println("Index of element is " + i);
            }

        }
        if (false) {
            System.out.println("-1");
        }


    }

    //
    static int[] reverseArr(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //
    static int[] reverseArr1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];

        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    public static String ArrayToString(int[] array) {

        if (array == null)
            return "empty array";
        int length = array.length - 1;
        if (length == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == length)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    static int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    static int findSecond(int[] array) {
        ArraysUtil.sortArray(array);
        System.out.println(array[array.length - 2]);
        return array[array.length - 2];

    }

    static int[] doubleArray(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = 2 * array[i];

        }
        System.out.println(Arrays.toString(array1));
        return array1;
    }

    static void containsArray(int[] array, int element) {
        boolean isBe = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isBe = true;
                break;

            }else {
                isBe = false;
            }

        }
        if (isBe) {
            System.out.println("The element contain in array");
        }
        if (!isBe) {
            System.out.println("The element dont contain in  array");


        }
    }


}
