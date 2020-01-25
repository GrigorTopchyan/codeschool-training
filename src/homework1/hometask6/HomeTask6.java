package homework1.hometask6;

import java.util.Scanner;

public class HomeTask6 {
    /**
     * Write a program that checks if given digit divides onto 3 and 7, using if-else-if, if-nested if, if with logical operators(&&)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = scanner.nextInt();
        if (number > 0) {
            if (number % 3 == 0 && number % 7 == 0) {

                System.out.println(number + " is divides into 3 and 7");

            } else if(number % 3 != 0 && number % 7 != 0){
                System.out.println("Number isn't divides into 3 and 7");
            }

        } else {

            System.out.println("Enter number >0:");
        }

    }
}
