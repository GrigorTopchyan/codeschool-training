package edu.training.codeschool.homework_for_29_01_2020.homework_12;

public class FindDuplicatesOfArray {
    public static int[] finder(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]<arr[i+1]){
                    int k = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = k;
                }
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2, 3, 4, 3, 4};
        System.out.println(finder(arr));
    }
}
