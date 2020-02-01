package edu.training.codeschool.homework2;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

//     4. Given n (Input n from console). Write a program
//     that prints "The number is prime" if the given number is prime,
//             otherwise it prints "The number is not prime".
//             (Note that the number is prime if it divides on 1 and on itself
public class HomeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isPrime = true;
        for (int j = 2; j <= a / 2; j++) {
            if (a % j == 0) {
                isPrime = false;
                System.out.println("The number isn`t prime");
                break;
            }

        }
        //էսի միշտ կտպի եթե prime էլ չլնի, ուղղի
        System.out.println("The number is prime");
    }
}
