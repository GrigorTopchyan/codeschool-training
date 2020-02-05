package edu.codeschool.training.classes_objects.homework4;


//
public class MyMath {
    //

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }


        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }


        }
        return max;
    }


    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static double sumOfElements(double[] array) {
        double sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static int mull(int[] array) {
        int mull = 1;
        for (int i = array[0]; i < array.length; i++) {
            mull = mull * array[i];

        }
        return mull;
    }

    public static double mull(double[] array) {
        double mull = 1;
        for (int i = 1; i < array.length; i++) {
            mull = mull * array[i];

        }
        return mull;
    }

    public static boolean isPrime(int number) {
        boolean t = true;
        if (number <= 0 || number == 1) {
            System.out.println("Is not Prime");

        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                t = false;

            }
            break;
        }
        if (t) {

            System.out.println("Is note Prime ");
        } else {
            System.out.println("Is Prime ");
        }
        return t;
    }


}

