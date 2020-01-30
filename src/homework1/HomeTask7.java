package homework1;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {
//        7.   Write a program that checks if given digit divides onto 5 or 6,
//        using if-else-if, if-nested if, if with logical operators(||)
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan % 5 == 0 || scan % 6 == 0) {
            System.out.println("The number divides onto 5 or 6");
        } else System.out.println("The Number doesn`t divide onto 5 or 6");
    }
}
