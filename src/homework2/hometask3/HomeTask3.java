package homework2.hometask3;

import java.util.Scanner;

public class HomeTask3 {
    /**
     * 3.Given two numbers n, m(Input m,n from console). Write a program to find
     * the value of one number raised to the power of another(m֊ի n աստիճանը).
     * (Do not use Java built-in method)
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int n2 = scanner.nextInt();
        System.out.println(raiseToThePower(n1, n2));
    }

    public static int raiseToThePower(int m, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= m;
        }
        return pow;
    }


}
