package homework1;

import java.util.Scanner;

public class HomeTask10 {
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        System.out.println("Enter the numbers to print result of sum");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();

        int sum = number1 * number2 * number3 * number4;
        System.out.println("Sum = " + sum);

    }
}
