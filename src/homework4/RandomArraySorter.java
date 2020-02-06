package homework4;

import java.util.Arrays;

public class RandomArraySorter {
    /**
     * 3.0 Գրել ծրագիր, որը կսորտավորի տրված զանգվածը աճման կամ նվազման կարգով
     * Զանգվածը սկզբնարժեքավորելու համար օգտագործել Math.random() ֆունկցիան
     */
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i <= array.length-1; i++) {
            array[i] = ((int) (Math.random() * 17) + 1);

        }

        boolean isSorted= true;
        while (isSorted) {
            isSorted=false;
            for (int i = 0; i < array.length - 1; i++) {
                int x = array[i ];
                if (array[i] > array[i + 1]) {

                    array[i ] = array[i+1];
                    array[i+1] = x;
                    isSorted=true;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
