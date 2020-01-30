package homework1;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan % 3 == 0 && scan % 7 == 0) {
            if (scan % 3 == 0)
                System.out.println("The number is divides 3");
            else if (scan % 7 == 0)
                System.out.println("The number is divides 7");
        } else {
            System.out.println("The number doesn`t divides onto 3 and 7");
        }


        }
    }


