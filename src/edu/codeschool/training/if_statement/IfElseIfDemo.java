package edu.training.codeschool.if_statement;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 10 ){
            System.out.println("i is 10");
        }else if(i == 15){
            System.out.println("i  is 15");
        }else if( i == 20) {
            System.out.println("i is 20");
        }else{
            System.out.println("i is not present");
        }
    }
}
