package homework1;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class HomerTask6 {
    public static void main(String[] args) {

        double a = -9999999;
        if (a > 0) {
            if (a < 1) {
                System.out.println("small positive");
            } else if (a > 100000) {
                System.out.println("large positive");
            } else {
                System.out.println("positiv");
            }
        } else if (a < 0)
        {
            if (-(a) < 1) {
                System.out.println("small negative");
            } else if (-(a) > 100000) {
                System.out.println("large negative");
            } else {
                System.out.println("negative");
            }

        }

        else
        {
            System.out.println("Zero");
        }

    }
}


























