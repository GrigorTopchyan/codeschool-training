package homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter for know the number is zero,negative or positive ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < 0) {
            System.out.println("The number is negative");
        } else if (a > 0) {
            System.out.println("THe number is positive");
        } else {
            System.out.println("The number is zero");
        }

    }

}
