package edu.training.codeschool.arrays;

public class Arrays {
    public static void main(String[] args) {
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // You can also place the brackets after the array's name:

        // this form is discouraged
        float arrayOfFloats[];

        // create an array of integers
        int [] anArray = new int[10];

        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth

        //Accessing array elements
        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);
        //ArrayIndexoutOfBoundsException
        System.out.println("Element 3 at index 2: " + anArray[3]);

        //Alternatively, you can use the shortcut syntax to create and initialize an array:

        int[] anotherArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };





    }
}
