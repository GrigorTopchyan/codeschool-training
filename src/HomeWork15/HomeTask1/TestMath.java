package HomeWork15.HomeTask1;

import java.util.Arrays;
import java.util.Date;

public class TestMath {
    public static void main(String[] args) {
        Integer[] arr = {4, 288, 3, 48, 43, 28};
        System.out.println(Math.arrMax(arr) + " = arrMax");
        System.out.println(Math.arrMin(arr) + " = arrMin");
        System.out.println(Arrays.toString(Math.sort(arr)));
        System.out.println(Math.search(arr, 3));
        System.out.println(Arrays.toString(Math.subArray(arr,3,3)));
        Car car1 = new Car("bmw","m3",new Date(2010));
        Car car2 = new Car("audi","s8",new Date(2015));
        int a =car1.compareTo(car2);
        System.out.println(a);
    }
}
