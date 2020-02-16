package HomeWork7.HomeTask1;

import java.util.Arrays;

public class ArraysUtil {
    public static void concatenateTwoArrays(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] array = new int[length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array[array1.length + j] = array2[j];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void findIndex(int[] array, int element) {
        boolean thereis = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                thereis = true;
                if (thereis) {
                    System.out.println("Index of " + element + " = " + i);
                }
            }
        }
        if (false) {
            System.out.println(-1);
        }

    }

    //քանի որ ես ու Արթուրը չգիտենք revers-ը մինուսն ա թե արրայը շրջած
    // դրա համար 2 ձևով էլ գրում ենք;
    //1 շրջած ձև
    public static void reverseArr(int[] array) {
        int x;
        for (int i = 0; i < array.length / 2; i++) {
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;

        }
        System.out.println(Arrays.toString(array));
    }

    //2 մինուսով
    public static void reverseArrNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    //    public static String toStringArr(int[] array) {
//        if (array == null)
//            return "null";
//        int iMax = array.length - 1;
//        if (iMax == -1)
//            return "[]";
//
//        StringBuilder b = new StringBuilder();
//        b.append('[');
//        for (int i = 0; ; i++) {
//            b.append(array[i]);
//            if (i == iMax)
//                return b.append(']').toString();
//            b.append(", ");
//        }
//    }
    public static void sort(int[] array) {
        int x;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }

        }
        System.out.println(Arrays.toString(array));
        ;
    }


    public static void findSecond(int[] array) {
        ArraysUtil.sort(array);
        System.out.println(array[array.length - 2]);
    }

    public static void doubleArray(int[] array) {
        int[] doubleArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = 2 * array[i];

        }
        System.out.println(Arrays.toString(doubleArray));
    }

    public static void contains(int[] array, int element) {
        boolean contains = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) { contains = true; break;}
            else {contains=false;}

        }
        if (contains) { System.out.println("The array contains " + element + " element"); }
            if (!contains) { System.out.println("not this element"); }

    }
}