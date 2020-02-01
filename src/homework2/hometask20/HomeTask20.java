package homework2.hometask20;

import java.util.ArrayList;

public class HomeTask20 {
    /**
     * 20.  Write a Java program to find a missing number in an array.
     * ex. {1,2,3,4,6,7,8,9} 5 is missing
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int[] arr1 = new int[arr.length + 1];
        int sum = 0;
        int sum1 = 0;
        int missingNumber;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        //Պետք չի նոր արայ սարքես արժեքավորես 1, n նոր գումար հաշվես
        //կարաս ողղակի sum1 += j;
        for (int j = 0; j <= arr1.length - 1; j++) {
            arr1[j] = j;
            sum1 += arr1[j];
        }
        missingNumber = sum1 - sum;
        System.out.println("missing number is: " + missingNumber);

    }
}

