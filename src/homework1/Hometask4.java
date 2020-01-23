package homework1;

import java.util.Scanner;

public class Hometask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number from 1 to 9");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
        System.out.println(number + " * "+ i + " = " + number * i);
//        int a = 8;
//        for (int i = 1; i <= 10; i++)
//            System.out.println("8 * " + i + " = " + 8 * i);


    }
}
