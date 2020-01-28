package edu.training.codeschool.homework2;

public class HomeTask6 {
    public static void main(String[] args) {
//        6. Given array = {1.2, 2.2, 5.5, 4.5, 5, 7.8, 8.5, 7, 5.1, 3.15}.
//                Write a Java program to calculate the average value of array elements.
        double[] array = new double[10];
        double res=0;
        array[0] = 1.2;
        array[1] = 2.2;
        array[2] = 5.5;
        array[3] = 4.5;
        array[4] = 5;
        array[5] = 7.8;
        array[6] = 8.5;
        array[7] = 7;
        array[8] = 5.1;
        array[9] = 3.15;
        for (int i = 0; i <array.length ; i++)
            res=res+array[i];
        System.out.println("The average value is "+res/array.length);





    }
}
