package HomeWork15.HomeTask1;

import java.util.Arrays;
import java.util.Date;

public class Math<M> {

    public static <T extends Comparable> T arrMax(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (max.compareTo(arr[i + 1]) < 0) {
                max = arr[i + 1];
            }
        }
        return max;
    }

    public static <S extends Comparable> S arrMin(S[] arr) {
        S min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (min.compareTo(arr[i + 1]) > 0) {
                min = arr[i + 1];
            }
        }
        return min;
    }

    public static <R extends Comparable> R[] sort(R[] arr) {
        R a = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        return arr;
    }

    public static <W extends Comparable, Y> boolean search(W[] arr, Y el) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(el) == 0) {
                b = true;
                break;
            }
        }
        return b;
    }

    public static <X> X [] subArray(X[] arr, int offset, int len) {
        X[] newArr = (X[]) new Object[len];
        int j =0;
        int i =offset;
        while (j<len&&j<arr.length){
            newArr[j]=arr[i];
            j++ ; i++;
        }
        return newArr;
    }

}
