package homework2;

import java.util.Arrays;

public class HomeTask16 {
    public static void main(String[] args) {

            int[] array1 = {4, 5, 6, 7};
            int[] array2 = {6, 7, 8, 9};
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == (array2[j])) {

                        System.out.print((array1[i]+" "));
                    }
                }
            }
        }
    }
