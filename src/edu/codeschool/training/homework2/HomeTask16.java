package edu.codeschool.training.homework2;

// Write a Java program to find the common elements between two arrays (int values)
//                    ex. {1,2,3,4} {3,4,5,6} -> common value 3,4

public class HomeTask16 {
    public static void main(String[] args) {
        int[] a1 = {4, 8, 6, 2, 1, 99, 74, 13, 54};
        int[] a2 = {13, 45, 96, 8, 27, 66, 6, 75};
        System.out.print("The common elements between to arrays are ");
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    //խի ես գրել a1[i] = a2[j]; պետք չի
                    a1[i] = a2[j];
                    System.out.print(a1[i] + ",");

                }
            }

        }
    }
}
