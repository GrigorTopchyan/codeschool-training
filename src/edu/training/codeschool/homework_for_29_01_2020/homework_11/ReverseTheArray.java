package edu.training.codeschool.homework_for_29_01_2020.homework_11;
import java.util.Arrays;
public class ReverseTheArray {
    public static void reverse(int[] arr ){
        for (int i = arr.length-1; i>=0; i--){
            System.out.print( arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }
}
