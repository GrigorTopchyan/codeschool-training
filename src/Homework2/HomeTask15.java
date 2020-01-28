package Homework2;

import java.util.Scanner;

public class HomeTask15 {

    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 &&  i % 10 == 0 && i % 7 != 0)
                System.out.print(i + ", ");
            }

        }
    }
