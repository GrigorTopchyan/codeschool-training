package edu.codeschool.training.generics;

public class Math<T> {
    public static <T extends Comparable> T min(T[] arr) {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];

            }

        }
        return min;

    }

    public static <T extends Comparable> T max(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];

            }

        }
        return max;

    }

    public static <T extends Comparable> T[] sort(T[] arr) {
        T temp;
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0) {
                temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        return arr;
    }

    public static <T extends Comparable> T[] reverse(T[] arr) {
        T temp;
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        return arr;
    }

    public static <T extends Comparable> boolean search(T[] arr, T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable> T[] subArray(T[] arr, int off, int len) {
        T[] array = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = off; j < len + off; j++) {
                array[i] = arr[j];
            }
        }
        return array;
    }// !!!!


}

