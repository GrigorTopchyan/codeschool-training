package homework2.hometask3;

import java.util.Scanner;

public class HomeTask3 {
    /**
     * 3.Given two numbers n, m(Input m,n from console). Write a program to find
     * the value of one number raised to the power of another(m֊ի n աստիճանը).
     * (Do not use Java built-in method)
     */
    public static void main(String[] args) {

        //m ֊ի  n ֊ ի տիպերը թող int լինեն
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        double n1 = scanner.nextDouble();
        System.out.println("Enter number 2:");
        double n2 = scanner.nextDouble();
        System.out.println(raiseToThePower(n1, n2));
    }

    public static double raiseToThePower(double m, double n) {
        double pow = 1;
        for (double i = 1; i <= n; i++) {
            pow *= m;
        }
        return pow;
    }


}
