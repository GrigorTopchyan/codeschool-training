package edu.training.codeschool.homework_lesson_5_feb_02.homework_9;

/**
 * 9. Create class MyMath in edu.codeschool.training.classes_objects.homework4 package.
 * 9.1 Create method min(int [] arr) which takes array of type int and returns minimum elementof the array.
 * Create method min(double [] arr) which takes array of type double and returns minimum element of the array.
 * Create method max(int [] arr) which takes array of type int and returns maximum element of the array.
 * Create method max(double [] arr) which takes array of type double and returns maximum element of the array.
 * Create method sum(int [] arr) which takes array of int and returns sum of array elements.
 * Create method sum(double [] arr) which takes array of double and returns sum of array elements.
 * Create method mull(int [] arr) which takes array of int and returns multiplication of array elements.
 * Create method mull(double [] arr) which takes array of double and returns multiplication of array elements.
 * Create method isPrime(int number) which returns if the number is prime or not.
 * 9.2 Create class TestMyMath in edu.codeschool.training.classes_objects.homework4.client package.
 * Inside main method calculate min max sum and mulltiplication of following arrays:
 * int [] intArray  = {1,2,8,3,6,5,4,7,8,9}
 * double [] doubleArray  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01}
 * Check weather the 1489775697 is prime or not.
 */
public class MyMath {
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public double min(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int mull(int[] arr){
        int multiplication = 1;
        for (int i = 0; i < arr.length; i++) {
            multiplication*=arr[i];
        }
        return multiplication;
    }
    public double mull(double[] arr){
        double multiplication = 0;
        for (int i = 0; i < arr.length; i++) {
            multiplication*=arr[i];
        }
        return multiplication;
    }
    public String isPrime(int num){
        boolean flag = true;
        for (int i = 2; i < num/2 ; i++) {
            if (num%i == 0){
                flag = false;
            }
        }
        if (flag){
            return (num + " is prime");
        }
            return (num + " is not prime");
    }

}
