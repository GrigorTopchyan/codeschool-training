package HomeWork1;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println();
        // if-else-if
        if (x % 3 == 0 && x % 7 == 0) {
            System.out.println("The digit divides onto 3 and 7(for if-else-if)");
        } else System.out.println("The digit doesn't divide onto 3 and 7(for if-else-if)");
        //if-nested-if
        if (x % 3 == 0 && x % 7 == 0) {
            System.out.println("The digit divides onto 3 and 7(for if-nested-if)");
        }
        if (x % 3 != 0 && x % 7 != 0) {
            System.out.println("The digit doesn't divide onto 3 and 7(for if-nested-if)");
        }


    }
}
