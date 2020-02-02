package edu.codeschool.training.homework2;

// Write a Java program to test the equality of two arrays
//                     ex. {1,2} {2,3,4} not equal , {1,2} {1,2} equal

public class HomeTask19 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 7, 8, 9};
        int[] array2 = {7, 8, 10, 5,};
        int[] array3 = {0, 2, 7, 8, 9};
        //Երկու արայի համար պիտի ստւգեիր
        //պետք չի ամեն անգամ array1.length == array2.length էլ ստւգես մի անգամ ստւգես հերիքա
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    if (array1[i] == array2[j] && array1.length == array2.length) {
                        System.out.println("array1 and array2 are equal");
                    } else {
                        System.out.println("array1 and array2 are not equal");

                    }
                    if (array1[i] == array3[k] && array1.length == array3.length) {
                        System.out.println("array1 and array3 are equal");
                    } else {
                        System.out.println("array1 and array3 are not equal");

                    }
                    if (array2[i] == array3[j] && array2.length == array3.length) {
                        System.out.println("array2 and array3 are equal");
                    } else {
                        System.out.println("array2 and array3 are not equal");

                    }

                    return;

                }


            }
        }
    }

}
