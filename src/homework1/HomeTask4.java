package homework1;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        System.out.println("Mutqagreq bnakan tiv");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum;
        for (int i = 1; i < 11; i++) {
            sum = x * i;
            System.out.println(x + " * " + i + " = " + sum);
        }


    }
}
