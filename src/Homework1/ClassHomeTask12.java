package Homework1;

import java.util.Scanner;

public class ClassHomeTask12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double d = scanner.nextDouble();

       if(d>0){
            System.out.println("positive");
        } else if(d<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        if(Math.abs(d)<1){
            System.out.println("small");
          }else if(Math.abs(d)>1000000){
            System.out.println("large");
        }

       }
    }