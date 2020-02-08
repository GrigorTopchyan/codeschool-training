package HomeWork5;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] array = HomeTask2.numberToArray(b);
        boolean t = true;
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                t = false;
                break;
            }
        }
        if (t) {
            System.out.println("is palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
}
