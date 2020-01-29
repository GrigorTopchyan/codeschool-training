package homework2;

import java.util.Scanner;

public class HomerTask3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input  number: ");
        int n = in.nextInt();
        System.out.print("Input  number: ");
        int m = in.nextInt();
        int sum=1;

        for (int i = 1; i <= m ; i++){
            sum=sum * n;
        }
        System.out.println(sum);
    }

}