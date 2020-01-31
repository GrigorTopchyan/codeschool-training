package edu.codeschool.training.homework2;

//Create a JAVA program to print the numbers that
//                    divide to 3 from 10 to 100, both included, except the numbers that divide to 7.

public class HomeTask15 {
    public static void main(String[] args) {
        int a;
        for (int i = 10; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 != 0) {
                System.out.print(i + ",");

            }
        }
    }
}
