package edu.training.codeschool.homework_for_29_01_2020.homework_9;

import java.util.Arrays;

public class CopyTheArray {
    private static int[] arrCopy(int[] arr) {
        int[] newArray = new int[arr.length];
        //k ն հայտարարել ես բայց չես օգտագործել պետք չի
        for (int i = 0, k = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //էս չհասկացա խի ես գրել
        newArray[0]++;
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(prettyArrayOutput("Original Array:", arr));
        arr = arrCopy(arr);
        System.out.println(prettyArrayOutput("Resultant Array:", arr));
    }

    private static String prettyArrayOutput(String beforeText, int[] array) {
        return beforeText + " " + Arrays.toString(array);
    }
}
