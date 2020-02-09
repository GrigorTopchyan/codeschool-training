package homework5;

import java.util.Arrays;

public class TestNumberToArrayConverter {
    public static void main(String[] args) {
        NumberToArrayConverter converter = new NumberToArrayConverter();
        int[] convert = converter.convert(123456789);
        String s = Arrays.toString(convert);
        System.out.println(s);
    }
}
