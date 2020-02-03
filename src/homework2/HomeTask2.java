package homework2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

       Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int factorial = 1;
        for (int i = 1; i <=n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}
