package edu.training.codeschool.homework_for_29_01_2020.homework_8;
import java.util.Arrays;
public class RemoveAnArrayElement {
   public static int[] removeElement(int[] arr, int index){
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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: "
                + Arrays.toString(arr));
        int index = 2;
        System.out.println("Index to be removed: "
                + index);

        arr = removeElement(arr, index);
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}
