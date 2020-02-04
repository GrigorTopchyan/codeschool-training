package homework4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MakeArr {
    /**
     * 2.0 Գրել ծրագիր, որը մուտքագրված թիվը կդարձնի արայ
     * Օրինակ․ 5678 -> [5,6,7,8]
     * 23 -> [2,3]
     */
    public static void main(String[] args) {
        int x = 5678;
        int y =0;
        char[] z = String.valueOf(x).toCharArray();



        for (int i = 0; i <z.length ; i++) {
            System.out.println(z[i]);
        }

    }
}
