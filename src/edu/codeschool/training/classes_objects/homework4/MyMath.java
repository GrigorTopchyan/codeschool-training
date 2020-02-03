package edu.codeschool.training.classes_objects.homework4;

public class MyMath {

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
        for (int i = 0; i <= arr.length-1; i++) {
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
        for (int i = 0; i <= arr.length-1; i++) {
            sum = arr[i];
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

