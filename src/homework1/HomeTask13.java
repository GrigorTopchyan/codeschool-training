package homework1;


import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();

        if (a < 0) {
            System.out.println(" negative");
        }
        if (a > 0) {
            System.out.println("positive");
        }  if (a == 0) {
            System.out.println(" zero");
            if (a > -1 && a < 1) {
                System.out.println(" small");

            } else if (a < -1000000 && a > 1000000) {
                System.out.println(" large");
            }
        }

        }
        }




