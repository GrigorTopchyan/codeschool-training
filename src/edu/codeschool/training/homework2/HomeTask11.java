package edu.codeschool.training.homework2;

//Given the array = {1,2,3,4,5,6}.Write a Java program to reverse the array of int values
//                    ex. {1,2,3,4,5,6} -> {6,5,4,3,2,1}

import java.util.Arrays;

public class HomeTask11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = new int[6];
        //sum փոփոխականը պետք չի
        int sum = 0;

        //Սխալ ես գրել չի աշխատում
        //պիտի for ով ֆռաս մինչև կեսը ու առաջինը վերջինի հետ, երկրորդը նախավերջինի հետ ․․․
        //տեղերով փոխես
        for (int i = array.length - 2; i > -(array.length / 2 - 1); i--) {
            array1[0] = array[1] + i;
        }
    }
}
