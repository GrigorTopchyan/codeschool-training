package homework2.hometask1;

import java.util.Scanner;

public class HomeTask1 {
    /**
     * 1. Write a program that prints the sum of odd numbers from 1 to N number(N = 1000_000).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = scanner.nextInt();
        int sumOfOddNumbers = 0;
        for (int i = 1; i <=countOfNumbers; i++) {
            if (i % 2 != 0) {
               //Ստեղ պետք չի տպել պահանջի մեջ չկա))
                System.out.println(i);
                sumOfOddNumbers += i;
            }

        }
        System.out.println("Sum of odd numbers = " + sumOfOddNumbers);
    }

}
