package edu.codeschool.training.classes_objects.HomeWork7.task1;

public class ArraysUtil {

    public static int findIndex(int[] arr, int value) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == value) {
                return index;
            }
        }
        return -1;
    }
    public static int[] reverseArr(int[] array) {

        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }
    public static String[] toString(int[] arr) {
        String s[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            s[i] = " el " + arr[i];

        }

        return s;
    }

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
    public static int[] doubleArray(int[] arr){
        int[] doubleArr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            doubleArr[i]=arr[i]*2;
        }
        return doubleArr;
    }

    public static int contains(int[] arr,int value){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==value){
                return 1;
            }
        }
        return 0;
    }

}
