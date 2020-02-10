package homework6.arraysutil;

import java.util.Arrays;

public class ArraysUtil {
    /**
     * 1.  Create class with name ArraysUtil. The class has the following static methods:
     * Create static method concatenateTwoArrays which receives as parameter two arrays of type int
     * and returns concatenation of the arrays.
*/

//  public   static int[] concatenateTwoArrays(int[] array1, int[] array2){
//        int [] bigArr= new int[array1.length+array2.length];
//        for (int i = 0; i <bigArr.length/2; i++) {
//            if (array1[i]>array2[i]) {
//                bigArr[i+i] = array2[i];
//                bigArr [i+i+1] = array1 [i];
//            } else {
//                bigArr [i+i] = array1 [i];
//               bigArr [i+i+1] = array2 [i];
//
//            }
//
//        }
//
//return bigArr;
//
//    }

    /**
     * static method findIndex that receives as parameter array of type int and element of type int
     * and returns the index of the element if array contains the element else return -1
     */

    public static int findIndex(int[] arr, int value) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == value) {
                return index;
            }
        }
        return -1;
    }

    /**
     * static method reverseArr which receives as parameter array of type int and returns the reversed array of that array.
     */
    public static int[] reverseArr(int[] array) {

        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }

    /**
     * static method toString() which receives as a parameter array of type int and
     * returns string representation of the array in this format [el1,el2,... ,eln]
     */
    public static String[] toString(int[] arr) {
        String s[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            s[i] = " el " + arr[i];

        }

        return s;
    }

    /**
     *  static method sort which receives as a parameter array of int and sorts the element in ascending order
     */

    static int[] sort(int[] arr) {
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < arr.length-1 ; i++) {
                int temp = arr[i];
                if (arr[i] > arr[i + 1]) {

                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
        return arr;

    }
   /**  static method findSecond which receives as a parameter array of int and returns the second largest element of the array*/


   public static int findSecond(int[] array){
       int firstLargeNumber=0;
       int secondLargeNumber=0;
       for (int i = 0; i <array.length ; i++) {
           if (array[i]>firstLargeNumber){
               secondLargeNumber=firstLargeNumber;
               firstLargeNumber=array[i];
           }else if(array[i]>secondLargeNumber){
               secondLargeNumber=array[i];
           }
       }
       return secondLargeNumber;
   }

/**
 *  static method doubleArray which receives array of type int and returns another array doubling(երկու անգամ մեծացնել) the elements of the given array
 */
public static int[] doubleArray(int[] arr){
    int[] doubleArr=new int[arr.length];
    for (int i = 0; i <arr.length ; i++) {
        doubleArr[i]=arr[i]*2;
    }
    return doubleArr;
}
/**
 * Create static method contains which receives array of int and element of type int and checks whether the array contains the element or not.
 */
 public static int contains(int[] arr,int value){
     for (int i = 0; i <arr.length ; i++) {
         if (arr[i]==value){
             return 1;
         }
     }
     return 0;
 }

}
