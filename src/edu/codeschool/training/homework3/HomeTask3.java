package edu.codeschool.training.homework3;

public class HomeTask3 {
    public static void main(String[] args) {
        int [] arr = {1,5,8,6};
        int temp;
        for (int i = 0; i <arr.length - 1  ; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            if (arr[i] < arr[i +1]) {
                temp = arr[i];
                arr[i] = arr[i +1];
                arr[i + 1] = temp;
            }


        }
    }
}
