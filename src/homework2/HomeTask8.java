package homework2;

import java.util.Arrays;

public class HomeTask8 {
    public static void main(String[] args){
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array: " + Arrays.toString(array));
        int index = 4;
        System.out.println("Index to be removed: " + index);
        array = removeTheElement(array, index);
        System.out.println("Resultant Array: " + Arrays.toString(array));

    }
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    }



