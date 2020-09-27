package HomeWork17.HomeTask1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ex {
    public static void main(String[] args) throws CustomIndexOutOfBoundsException {
        CustomArrayList<Integer> arr = new CustomArrayList<>(3);
        System.out.println(arr.get(2));
        arr.add(8);
        arr.add(7);
        System.out.println(arr);

    }
}
