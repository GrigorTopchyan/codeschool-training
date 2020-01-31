package edu.codeschool.training.homework2;

import com.sun.deploy.security.JarAsBLOBVerifier;

//  Write a Java program to compute a count of true and false elements in boolean array
//                     ex. {true, false, false, false, true, false} -> 2 true, 4 false

public class HomeTask18 {
    public static void main(String[] args) {
        boolean[] array = {true, false, true, true, false, false, true, false, true, true, false};
        int sumTrue = 0;
        int sumFalse = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                sumTrue++;
            } else {
                sumFalse++;
            }


        }
        System.out.println( sumTrue + " true");
        System.out.println(sumFalse + " false");


    }
}




