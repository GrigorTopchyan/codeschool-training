package edu.codeschool.training.homework2;

//Given array = {1, 2, 5, 5, 6, 6, 7, 2}.
//                    Write program that prints duplicate values of the array.
//                    So the output should be:
//                              Duplicate value is: 5
//                              Duplicate value is: 6
public class HomeTask12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};
        for (int i = 0; i < array.length; i++) {

            for (int c = i + 1; c < array.length; c++) {
                if (array[i] == array[c]) {
                    System.out.println("Duplicate value is : " + array[c]);

                }
            }


        }

    }
}













