package Homework1;

import java.util.Scanner;

public class ClassHomeTask3 {
    public static void main(String[] args) {


        //  1 option
//        Scanner scanner1 = new Scanner(System.in);
//        int i;
//        do {
//            System.out.println("Print the  odd number");
//            i = scanner1.nextInt();
//        } while (i % 2 != 0);
//        System.out.println("You printed the number is even");



        //2 option
        Scanner scanner2 = new Scanner(System.in);
        int j = 0;
        System.out.println("Printing the number");
        j = scanner2.nextInt();
        if (j % 2 != 0) {
            System.out.println("You printed is even number");
        } else {
            System.out.println("You printed is odd number");

        }

    }

}


