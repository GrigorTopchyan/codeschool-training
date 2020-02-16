package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersOnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[Integer.toString(number).length()];

        while (number != 0) {
            int t;
            t = number % 10;
            array[Integer.toString(number).length() - 1] = t;
            number = (number - t) / 10;

            System.out.println(t);

        }
        System.out.println(Arrays.toString(array));
// numbers to array
    }

    public static int[] numberToArray(int number) {
        int[] array = new int[Integer.toString(number).length()];
        int t;
        while (number != 0) {

            t = number % 10;
            array[Integer.toString(number).length() - 1] = t;
            number = (number - t) / 10;

        }
        return array;
    }
}

