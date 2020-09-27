package HomeWork15.HomeTask2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException, ColloectionIsFullException {
        Integer[] arr = new Integer[5];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        Collection<Integer> collection = new Collection<Integer>(arr, 10);
        collection.add(3);
        collection.add(3);
        collection.add(3);
        System.out.println(Arrays.toString(arr));
        System.out.println(collection.size());
        System.out.println(collection.get(3));
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains(8));
        System.out.println(collection.size());
    }
}
