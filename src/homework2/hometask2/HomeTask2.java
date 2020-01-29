package homework2.hometask2;

import java.util.Scanner;

public class HomeTask2 {
    /**
     * 2. Write a program to print the factorial value of the given N(Input N from a console).
     * Please note that N! = 1 * 2 * 3 * ... * N
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long factorial = scanner.nextLong();
        long x = 1;
        if (factorial == 0 || factorial == 1) {
            x = 1;
            System.out.print(" factorial " + factorial + " = " + x);
        } else if (factorial > 1) {
            for (long i = 1; i <= factorial; i++) {
                x *= i;

            }
            System.out.print(" factorial " + factorial + " = " + x);
        }
    }
}
