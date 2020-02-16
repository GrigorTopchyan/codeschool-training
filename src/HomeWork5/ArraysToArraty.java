package HomeWork5;

import java.util.Arrays;

public class ArraysToArraty {
    public static void main(String[] args) {
        int [] array1= {1,3,6,7,9};
        int [] array2={2,4,5,8};
        int [] array=new int [array1.length+array2.length];
        for (int i = 0; i <array1.length ; i++) {
            array[i]=array1[i];

        }
        for (int j = 0; j <array2.length ; j++) {
            array[array1.length+j]=array2[j];
            System.out.println(Arrays.toString(array));
        } int y;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    y = array[i];
                    array[i] = array[j];
                    array[j] = y;
                }

            }
            System.out.println(Arrays.toString(array));

        }
    }
}
