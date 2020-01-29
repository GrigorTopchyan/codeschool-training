package com.javalesson.homework2;

public class HomeTask11 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] array1 = new int [6];
        int sum = 0;
        for (int i = array.length - 2; i>-(array.length/2 - 1) ;i--){
            array1 [0] = array[1] + i ;
            System.out.println(array1[0]);
        }

    }
}
