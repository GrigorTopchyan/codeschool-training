package edu.training.codeschool.homework_for_29_01_2020.homework_9;
import java.util.Arrays;
public class CopyTheArray {
    public static int[] arrCopy(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0, k = 0; i< arr.length; i++ ){
            newArray[i] = arr[i];
        }
        newArray[0]++;
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: "
                + Arrays.toString(arr));


        arr = arrCopy(arr);
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}
