package homework2.hometask8;

import java.util.Arrays;

public class HomeTask8 {
    /**
     * 8. Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49} and index = 4.
     * Write a Java program to remove the element with the index from an array.
     * Print the array before and after removal of the element
     */
    public static void main(String[] args) {

        //Էս դզի անցած դասին նայեցինք։ Դու ստեղ remove չես անում
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = 4;
        int x =0;
        int[] arr2=new int[12];
        for (int i = 0; i <= array.length - 1; i++) {

            if (i != index) {
                arr2[x++]=array[i];
            }
            while (i < array.length){
            arr2[i++] = 0;
        }
            System.out.println(arr2[i]);
        }


//        int[] A = {1,3,5,6,6,2,4,8,1,3,4,7,8};
//        A = remove(A,3);
//        for(int i : A)
//        {
//            System.out.print(i + " ");
//        }
//
//    }
//    public static int[] remove(int[] arr, int match){
//        int i = 0;
//        for(int j = 0; j < arr.length; j++){
//            if (arr[j] != match)
//                arr[i++] = arr[j];
//        }
//        while (i < arr.length){
//            arr[i++] = 0;
//        }
//        return arr;
    }


}
