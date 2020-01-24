package Homework1;

import java.util.Scanner;

public class ClassHomeTask12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        double d = scanner.nextDouble();


        if(d==0){
            System.out.println("Zero number");
        }
        else if(d>0){
            if(d<1){
                System.out.println("positive small number");
            }
            else if(d > 1000000){
                System.out.println("positive large number");
            }
            else{System.out.println("positive number");}
        }

        else {
            System.out.println("negative number");
        }

    }
}


