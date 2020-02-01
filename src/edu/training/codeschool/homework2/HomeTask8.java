package edu.training.codeschool.homework2;

public class HomeTask8 {
    public static void main(String[] args) {
//        Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} and index = 4.
//        Write a Java program to remove the element with the index from an array.
//        Print the array before and after removal of the element
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        //Ստեղ ուղղակի տպել ես remove չես արել, պիտի արայից հեռացնես էլեմենտը
        //այսինքն վերջում քո արայը պիտի լինի
        //{25, 14, 56, 15, 56, 77, 18, 29, 49,0};
        //փորձի գրես
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i != 4) {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
