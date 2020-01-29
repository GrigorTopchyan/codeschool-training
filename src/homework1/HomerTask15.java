package homework1;

import java.util.Scanner;

public class HomerTask15 {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        double num1 = in.nextDouble();
        if (num1%3==0 && num1%7==0) {
            System.out.println("num1");
        }else {
            System.out.println("digit divided not intu 3 end 7");


        }
    }
}
