package homework1;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the number to print multiplication table");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for (y = 1; y <= 10; y++) {
            System.out.println(x + "*" + y + "=" + (x * y));
        }

    }
}
