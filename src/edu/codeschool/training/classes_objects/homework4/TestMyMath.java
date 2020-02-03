package edu.codeschool.training.classes_objects.homework4;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int [] arr  = {1,2,8,3,6,5,4,7,8,9};
        System.out.println(myMath.min(arr));
        System.out.println(myMath.max(arr));
        System.out.println(myMath.sum(arr));
        System.out.println(myMath.mull(arr));
        double [] array  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};
        System.out.println(myMath.min(array));
        System.out.println(myMath.max(array));
        System.out.println(myMath.sum(array));
        System.out.println(myMath.mull(array));
    }

}
