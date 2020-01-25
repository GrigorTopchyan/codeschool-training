package Homework1;

import java.util.Scanner;

public class ClassHomeTask6 {

    public static void main(String[] args) {

        int i = 3;
        int j = 7;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        i = scanner.nextInt();
        j = scanner.nextInt();


        if (i % 3 != 0   &&   j % 7 != 0) {
            System.out.println(" The number is not divisible by 3 and 7");
        }else if (i % 3 == 0  && j % 7 == 0) {
            System.out.println("The number is divided by 3 and 7");
        }


    }
}
