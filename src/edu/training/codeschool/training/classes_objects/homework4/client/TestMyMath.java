package edu.training.codeschool.training.classes_objects.homework4.client;

import edu.training.codeschool.training.classes_objects.homework4.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int[] arr = {1,2,3,4};
        System.out.println(myMath.min(arr)); ;
        System.out.println(myMath.max(arr)); ;
        System.out.println(myMath.sum(arr)); ;
        System.out.println(myMath.mull(arr)); ;
    }
}
