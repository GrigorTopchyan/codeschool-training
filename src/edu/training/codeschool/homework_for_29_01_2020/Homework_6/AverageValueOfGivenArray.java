package edu.training.codeschool.homework_for_29_01_2020.Homework_6;

public class AverageValueOfGivenArray {
    public static void main(String[] args) {
        double[] arr = {1.2,2.2,5.5,4.5,5,7.8,8.5,7,5.1,3.15};
        double avg = 0;
        double sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum+=arr[i];
//        }
        for (double x:arr) {
            sum+=x;
        }
        avg = sum/arr.length;
        System.out.println("the average value of given array is equal to : " + avg);
    }
}
