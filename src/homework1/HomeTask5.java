package homework1;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        for (int i = 1; i <= scan; i = i + 2) {
            int spaceCount = (scan - i) / 2;
            for (int j = 0; j < scan; j++) {
                if (j < spaceCount || j >= (scan - spaceCount)) {
                    System.out.print(" ");
                } else {
                    System.out.print("$");
                }
                System.out.print(" ");
            }
            System.out.println();


        }
    }

}





