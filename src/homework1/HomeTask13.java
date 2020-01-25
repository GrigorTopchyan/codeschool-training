package homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {
        double a;
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
        System.out.println("Enter the number for know number is small or large");
        double b;
        Scanner fc = new Scanner(System.in);
        b = fc.nextInt();
        if (b<1){
            System.out.println("The number is small");

        }
        else if (b>1_000_000){
            System.out.println("The number is large");
        }

    }




}
