package Homework1;

import java.util.Scanner;

public class ClassHomeTask10 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter 4 any digits : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();


        System.out.print((number1 + number2 + number3 + number4) * number1);
        System.out.println();
        System.out.print((number1 + number2 + number3 + number4) * number2);
        System.out.println();
        System.out.print((number1 + number2 + number3 + number4) * number3);
        System.out.println();
        System.out.print((number1 + number2 + number3 + number4) * number4);



    }
}




