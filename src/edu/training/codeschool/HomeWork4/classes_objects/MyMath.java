package edu.training.codeschool.HomeWork4.classes_objects;

public class MyMath {
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public static  double min(double[] arr) {

        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static double max(double[] arr) {

        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static  int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }
        public static  double sum ( double[] arr){
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];

            }
            return sum;
        }
        public static  int mull(int [] arr){
        int mull=1;
            for (int i = 0; i <arr.length ; i++) {
                mull=mull*arr[i];
            } return mull;
        }
    public static  double mull(double [] arr){
        double mull=1;
        for (int i = 0; i <arr.length ; i++) {
            mull=mull*arr[i];
        } return mull;
    }
    public static boolean isPrime(int number){
        boolean b =true;
        if(number<=1){ b=false;
            System.out.println(number+" not Prime");
        }
        for (int i = 2; i <number/2 ; i++) {
            if(number%i!=0){ b=false;
                System.out.println(number+" not prime");
            } else{ b=true;
                System.out.println(number+" is Prime");
            }break;

        } return b;
    }
    }
