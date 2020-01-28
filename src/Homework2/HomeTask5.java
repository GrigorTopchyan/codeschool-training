package Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeTask5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        int i;
        double result=0.0;
        for(i=1; i<=5; i++){

            result = result + (double) 1/i;
        }
        System.out.println("1+1/2+1/3+1/4+1/5 = "+result);
    }


    }

