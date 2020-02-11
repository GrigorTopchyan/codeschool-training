package homework6.task1.arraysutil;

import java.util.Arrays;

public class ArraysUtilTest {
    public static void main(String[] args) {
                int[] arr = {2, 3, 54, 56, 78, 9, 8};

        System.out.println("Index = "  + ArraysUtil.findIndex(arr, 56));
        System.out.println("Array reverse "+Arrays.toString(ArraysUtil.reverseArr(arr)));
        System.out.println("Array sort "+ Arrays.toString(ArraysUtil.sort(arr)));
        System.out.println("Convert int to String "+Arrays.toString(ArraysUtil.toString(arr)));
        System.out.println("Second large number = "+ArraysUtil.findSecond(arr));
        System.out.println("Double all elements from array "+Arrays.toString(ArraysUtil.doubleArray(arr)));
        System.out.println("Find value of array "+ArraysUtil.contains(arr,9));
        ;
    }
}
