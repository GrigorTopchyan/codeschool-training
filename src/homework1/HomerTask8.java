package homework1;

import java.util.Scanner;

public class HomerTask8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        double input = in.nextDouble();
        double weight = input*17/100;
        System.out.println(weight);
    }
}