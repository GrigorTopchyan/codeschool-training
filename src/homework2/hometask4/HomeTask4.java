package homework2.hometask4;

import java.util.Scanner;

public class HomeTask4 {
    /**
     * 4. Given n (Input n from console). Write a program that prints "The number is prime" if the given number is prime,
     *                    otherwise it prints "The number is not prime".
     *                    (Note that the number is prime if it divides on 1 and on itself)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number / 2 % 2 != 0) {
            System.out.println(number);
        }

////not
    }
}
