package homework1;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class HomeTask15 {
    public static void main(String[] args) {
        int number1, number2, number3, number4, number5;
        System.out.println("Enter the numbers to print result of sum and average");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();
        number5 = sc.nextInt();
        int sum = number1 * number2 * number3 * number4 * number5;
        System.out.println("Result of Sum =" + sum);
        int average = (number1 + number2 + number3 + number4 + number5) / 2;
        System.out.println("Result of Average =" + average);
    }
}
