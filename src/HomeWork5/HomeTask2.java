package HomeWork5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //անունները լավ դիր օրինակ կարար լիներ number
        int b = scanner.nextInt();
        int[] array = new int[Integer.toString(b).length()];
        //Էս t ն կարաիր հենց while ի մեջ հայտարարեիր մենակ էտ բլօկի մեջ ես օգտագործում
        int t;
        while (b != 0) {
            t = b % 10;
            //սենց մի գրի միհատ counter պահի ու գումարի
            //օրինակ array[counter++] = t;
            array[Integer.toString(b).length() - 1] = t;
            b = (b - t) / 10;

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

