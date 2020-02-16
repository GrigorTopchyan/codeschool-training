package HomeWork5;

import java.util.Scanner;

public class PalindromNoPalondrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] array = NumbersOnArray.numberToArray(b);
        boolean isPolindrome = true;
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPolindrome = false;
                break;
            }
        }
        if (isPolindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
}
