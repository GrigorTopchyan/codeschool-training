package edu.training.codeschool.homework2;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
//        5. Write a program to calculate the sum of following series where n(Input n from console).
//        1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
        Scanner scanner = new Scanner(System.in);
        //a - ն պիտի int լինի
        float a = scanner.nextInt();
        float b = 1;
        float res=0;
        //for ի մեջ counter ի համար float մի օգտագործի
        //b/1 անիմաստա
        for (float c = b / 1; c <= a; c++)
           res= b+(b/c);
        System.out.println("The sum is "+res);




    }
}
