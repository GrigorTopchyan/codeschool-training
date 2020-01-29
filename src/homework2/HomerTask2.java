package homework2;

import java.util.Scanner;

public class HomerTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int N = in.nextInt();
        int fact = 1;
        for (int i = 1 ; i <= N ; i ++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
