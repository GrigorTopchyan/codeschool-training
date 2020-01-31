package HomeWork2;

import java.util.Arrays;

public class HomeTask17 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] newarray = new int[array.length];
        int x = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }


            }
        }
        System.out.println(Arrays.toString(array));
        int secondsmallest = array[1];
        int secondlargest = array[array.length-1];
        System.out.println("Second Smallest is "  +secondsmallest
                +" Second largest is "+secondlargest );
    }

}
