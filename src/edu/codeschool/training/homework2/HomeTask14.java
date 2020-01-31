package edu.codeschool.training.homework2;

import java.util.Scanner;

//Given firstNum(Input from console), secondNum(Input from console). Write java program that uses while loop
//                     to perform following steps:
//                            1. Output all even numbers between firstNum and secindNum
//                            2. Output the sum of all odd numbers between firstNum and secindNum

public class HomeTask14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int sum = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number =" + i);
            } else {
                sum = sum + i;

            }

        }
        System.out.println("Sum =" + sum);

    }
}
