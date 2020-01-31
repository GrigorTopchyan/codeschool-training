package HomeWork2;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sum = 0;
        double a = 1;
        for (double i = 1; i <= n; i++) {
            sum = sum + a / i;

        }
        System.out.println("sum =" + sum);
    }
}
