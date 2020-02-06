package homework2.hometask20;

import java.util.ArrayList;

public class HomeTask20 {
    /**
     * 20.  Write a Java program to find a missing number in an array.
     * ex. {1,2,3,4,6,7,8,9} 5 is missing
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5, 6, 7, 8, 9,10,12};

        int sum = 0;
        int sum1 = 0;
        int missingNumber;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }


        for (int j = 0; j <= 11; j++) {

            sum1 += j;
        }
        missingNumber = sum1 - sum;
        System.out.println("missing number is: " + missingNumber);

    }
}

