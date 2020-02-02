package homework2.hometask5;

import java.util.Scanner;

public class HomeTask5 {
    /**
     * Write a program to calculate the sum of following series where n(Input n from console).
     * 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0.0;
        System.out.println("Enter number: ");
        double n = scanner.nextDouble();
        //for ի մեջ աշխատեք double չոգտագործեք
        //կարար սենց լիներ
        for (int i = 1; i < n; i++) {
            x = x + 1.0 / i;
        }
        System.out.println(x);
    }
}
