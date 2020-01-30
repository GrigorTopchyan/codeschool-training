package homework1;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        if (scan % 5 == 0 || scan % 6 == 0) {
            if (scan % 3 == 0)
                System.out.println("The number is divides 5");
            else if (scan % 7 == 0)
                System.out.println("The number is divides 6");
        } else {
            System.out.println("The number doesn`t divides onto 5 and 6");
        }

            }
        }


