package edu.codeschool.training.classes_objects.homework4;

public class TestMyMath {

    public static void main(String[] args) {

        int [] intArray  = {1,2,8,3,6,5,4,7,8,9};


        int max = intArray[0];
        int min = intArray[0];


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }


        int sum = 0;
        for (int number : intArray) {
            sum = sum + number;
        }


        int mull = 1;
        for (int w = 0; w < intArray.length ; w++) {
            mull = mull * intArray[w];
        }


        System.out.println("Maximum numbers is : " + min);
        System.out.println("Minimum number is : " + max);
        System.out.println("Sum number is : "+ sum);
        System.out.println("Multiplication number is :" + mull);


        System.out.println();


        double [] doubleArray  = {1.5, 2.9, 8.9,
                3.1, 6.2, 5.8, 4.7, 7.0, 8.78, 9.01};



        double max4 = 0;
        double min4 = 0;
        for (int m = 0; m < doubleArray.length ; m++) {

            if(doubleArray[m] > max4){
                max4 = doubleArray[m];

            }else if(doubleArray[m] < min4){
                min4 = doubleArray[m];
            }
        }

        double sum4 = 0;
        for (double v3 : doubleArray) {
            sum4 += v3;
        }

        double mull4 = 1;
        for (double v4 : doubleArray) {
            mull4 *= doubleArray[(int) v4];
        }





        System.out.println("Minimum of double elements is : "+ min4);
        System.out.println("Maximum of double elements is : " + max4);
        System.out.println("Sum of double elements is :"+ sum4);
        System.out.println("Multiplication of double elements is :"+ mull4);


        System.out.println();


        if(1489775697 % 2 != 0){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }


            }

        }









