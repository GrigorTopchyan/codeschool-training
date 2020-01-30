package homework2;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args){

        int n;
        Scanner console = new Scanner(System.in);
        double sum = 0;
        n = console.nextInt();
        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);

    }
}
