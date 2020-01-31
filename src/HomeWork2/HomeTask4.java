package HomeWork2;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0 || n == 1) {
            System.out.println("The number not Prime");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                b = false;
                break;

            }
        }
        if (b) {
            System.out.println("The number  Prime");
        } else {
            System.out.println(" The number not Prime");
        }
    }

}
