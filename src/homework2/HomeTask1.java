package homework2;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
