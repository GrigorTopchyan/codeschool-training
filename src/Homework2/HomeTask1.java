package Homework2;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Print sum of odd numbers till : ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if((i % 2) != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is : " + sum);
      }
    }


