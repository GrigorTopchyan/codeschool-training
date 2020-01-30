package homework1;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
//         6.   Write a program that checks if given digit divides onto 3 and 7,
//         using if-else-if, if-nested if, if with logical operators(&&)
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan % 3 == 0 && scan % 7 == 0) {
            if (scan % 3 == 0)
                System.out.println("The number divides onto 3");
            if (scan % 7 == 0)
                System.out.println("The number divides onto 7");
        } else {
            System.out.println("The number doesn`t divides onto 3 and 7");
        }


    }
}
