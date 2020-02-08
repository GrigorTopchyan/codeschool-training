package homework4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker {
    /**
     * 2.0 Գրել ծրագիր, որը մուտքագրված թիվը կդարձնի արայ
     * Օրինակ․ 5678 -> [5,6,7,8]
     * 23 -> [2,3]
     */
    public static void main(String[] args) {

        int num = 5678;
        //Արսեն ջան գրի առանց toCharArray օգտագործելու անցած դասին ալգորիթմը նայեցինք
        char[] array = String.valueOf(num).toCharArray();

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }


    }
}
