package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Wrapper3 {

    public static void main(String[] args) {

        Double aDouble =10.76;
        double d = aDouble.doubleValue();
        System.out.println("Value = " + d);

        System.out.println();

        //
        Double w = Double.parseDouble("765.8");
        System.out.println(w);


        System.out.println();


        //
        double [] values = {56.7, 12.9, 27.4, 54.2, 87.3};
        int smallest = Integer.MAX_VALUE;
        int largest  = Integer.MIN_VALUE;
        for (double value : values) {
            if (value < smallest) {
                smallest = (int) value;
            } else if (value > largest) {
                largest = (int) value;
            }
        }
        System.out.println("Smallest number of arrays is : " + smallest);
        System.out.println("Largest number of arrays is : " +  largest);



    }

}
