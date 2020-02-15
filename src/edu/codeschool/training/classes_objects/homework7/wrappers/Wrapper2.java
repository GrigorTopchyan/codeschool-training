package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Wrapper2 {
    public static void main(String[] args) {

        Integer firstInteger = 100;
        Integer secondInteger = new Integer(100);

        System.out.println(firstInteger.equals(secondInteger));


        System.out.println();

        //
        int[] values = {56, 12, 27, 54, 87};
        int smallest = Integer.MAX_VALUE;
        int largest  = Integer.MIN_VALUE;
        for (int value : values) {
            if (value < smallest) {
                smallest = value;
            } else if (value > largest) {
                largest = value;
            }
        }
        System.out.println("Smallest number of arrays is : " + smallest);
        System.out.println("Largest number of arrays is : " +  largest);


        System.out.println();

        //
        int x = Integer.parseInt("9");
        System.out.println(x);

    }
}
