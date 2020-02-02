package homework2.hometask19;

import java.util.Arrays;

public class HomeTask19 {
    /**
     * 19.  Write a Java program to test the equality of two arrays
     *                      ex. {1,2} {2,3,4} not equal , {1,2} {1,2} equal
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,3,6,4,3};
        int[] arr2 = {1,2,5,3,6,4,3};
        //մի օգտագործի եղած ջավայի գրադարանը փորձի դու գրես
        System.out.println(Arrays.equals(arr1,arr2));
        }
    }

