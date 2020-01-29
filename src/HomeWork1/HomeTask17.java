package HomeWork1;

import java.util.Scanner;

public class HomeTask17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num1 = scanner.nextDouble();
        char b = scanner.next().charAt(0);
        Double num2 = scanner.nextDouble();
        switch (b) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);break;

            case '/':
                System.out.println(num1 / num2);break;
        }

    }
}
