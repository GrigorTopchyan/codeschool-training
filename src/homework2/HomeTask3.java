package homework2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int n2 = scanner.nextInt();
        System.out.println(raiseToThePower(n1, n2));
    }
    public static int raiseToThePower(int m, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= m;
        }
        return sum;
    }
    }

