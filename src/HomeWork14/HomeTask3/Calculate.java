package HomeWork14.HomeTask3;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;


        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number1");

        num1 = scanner.nextInt();

        System.out.println("please enter number2");
        num2 = scanner.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();
        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        }
        if (operation.equals("-")) {
            System.out.println(num1 - num2);
        }
        if (operation.equals("*")) {
            System.out.println(num1 * num2);
        }
        if (operation.equals("/")) {
            System.out.println(num1 / num2);
        }


    }
}
