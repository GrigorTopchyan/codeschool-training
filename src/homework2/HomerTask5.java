package homework2;

import java.util.Scanner;

public class HomerTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        double n = in.nextDouble();
        System.out.print("Input  number: ");

        double sum = 0;
        for (double i = 1; i <=n; i++) {
            sum = sum  + 1 / i;
        }


        System.out.println("sum = "+ sum);
    }
}
