package Homework1;

import java.util.Scanner;

public class ClassHomeTask7 {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");

        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x % 5 == 0 || y % 6 ==0){
            System.out.println("The number is divisible by 5 or 6");
        }else{
            System.out.println("The number is not divisible by 5 or 6");
        }
    }
}
