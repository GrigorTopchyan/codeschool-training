package Homework1;

import java.util.Scanner;

public class ClassHomeTask8 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double n1 = 1.2;
        double n2 = 0.6;
        double n3 = -2.5;
        double n4 = 0;


        System.out.println("The larger number of 1.2 and 0.6 is: " + Math.max(n1,n2));
        System.out.println("The larger number of -2.5 and 0 is " + Math.max(n3,n4));
        System.out.println("The smaller number of 1.2 and 0.6 is: " + Math.min(n1,n2));
        System.out.println("The smaller number of -2.5 and 0 numbers is: " + Math.min(n3,n4));


    }
}






