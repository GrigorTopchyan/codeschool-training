package homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {
//        13.  Write a Java program that checks a floating-point number and
//        prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
//                Add "small" if the absolute value of the number is less than 1,
//                or "large" if it exceeds 1,000,000.
        Scanner scanner = new Scanner(System.in);
        double scan = scanner.nextDouble();
        if (scan == 0) {
            System.out.println("Zero");
        } else if (scan > 0 & scan < 1_000_000) {
            if (scan < 1 & scan > 0) {
                System.out.println("small");
            }
            System.out.println("Positiv");
        } else if (scan < 0) {
            System.out.println("Negativ");
        } else if (scan > 1000000) {
            System.out.println("large");
        }
    }

//chi stacvum mutqagrel float tipi tiv
}

