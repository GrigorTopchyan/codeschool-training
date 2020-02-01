package edu.training.codeschool.training.classes_objects.homework4;

public class MyMath {
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
     */
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public double min(double[] arr) {
        double min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }



    public int mull(int[] arr) {
        int mull = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            mull *= arr[i];
        }
        return mull;

    }
    public double mull(double[] arr) {
        double mull = 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            mull *= arr[i];
        }
        return mull;

    }

}


