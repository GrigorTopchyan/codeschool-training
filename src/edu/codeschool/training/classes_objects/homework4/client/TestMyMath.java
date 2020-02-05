package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 8, 3, 6, 5, 4, 7, 8, 9};
        double[] doubleArray = {1.5, 2.9, 8.9, 3.1, 6.2, 5.8, 4.7, 7.0, 8.78, 9.01};
        MyMath.min(intArray);
        MyMath.min(doubleArray);
        MyMath.min(doubleArray);
        MyMath.max(intArray);
        MyMath.max(doubleArray);
        MyMath.sumOfElements(intArray);
        MyMath.sumOfElements(doubleArray);
        MyMath.mull(intArray);
        System.out.println(MyMath.mull(intArray));
        MyMath.mull(doubleArray);
        MyMath.isPrime(12);


    }


}