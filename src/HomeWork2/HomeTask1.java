package HomeWork2;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        for (a = 1; a < 1000000; a += 2) {
            sum = sum + a;
        }
        System.out.println("Sum = " + sum);

    }
}
