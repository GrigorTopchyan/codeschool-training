package homework4;

import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConverterTester {
    /**
     * 2.0 Գրել ծրագիր, որը մուտքագրված թիվը կդարձնի արայ
     * Օրինակ․ 5678 -> [5,6,7,8]
     * 23 -> [2,3]
     */
    public static void main(String[] args) {
       NumberToArrayConverter converter = new NumberToArrayConverter();

        System.out.println(Arrays.toString(converter.convert(56789)));
    }


}
