package homework4;

import java.util.Arrays;

public class BigArrayMakerAndSorter {

    /**
     *
     * Գրել մեթոդ, որը ստանումա երկու սորտավոռված արրայ որպես պարամետեր և վերադարձնում է դրանց միավորված արայը սորտավորված աճման կարգով։
     *        Օրինակ։
     *            {1,3,6,7,9} և {2,4,5,8} պիտի վերադարձնի {1,2,3,4,5,6,7,8,9}
     */
    public static void main(String[] args) {
        int[] ints = {3, 1, 2, 4, 5};
        int[] ints2 = {7, 6, 9, 11, 8, 10};
        int[] bigArr = new int[ints.length + ints2.length];
        for (int i = 0; i < bigArr.length / 2; i++) {
            bigArr[i+i] = ints2[i];
            bigArr[i+i + 1] = ints[i];

        }
        boolean isSorted= true;
        while (isSorted) {
            isSorted=false;
            for (int i = 0; i < bigArr.length - 1; i++) {
                int x = bigArr[i ];
                if (bigArr[i] > bigArr[i + 1]) {

                    bigArr[i ] = bigArr[i+1];
                    bigArr[i+1] = x;
                    isSorted=true;
                }

            }
        }
        System.out.println(Arrays.toString(bigArr));
    }
}


