package homework2.hometask8;

import java.util.Arrays;

public class HomeTask8 {
    /**
     * 8. Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} and index = 4.
     * Write a Java program to remove the element with the index from an array.
     * Print the array before and after removal of the element
     */
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index =4;
        for (int i = 0; i <= array.length - 1; i++) {

            if (i == index) {
                continue;
            }
            System.out.println(array[i]);
        }

    }
}
