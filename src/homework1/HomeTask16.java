package homework1;

import java.util.Scanner;

public class HomeTask16 {
    public static void main(String[] args) {

    double m ;
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        double f = m * 9.8;
        double j = 5.8;
        double moonGravitation = f/j;
        System.out.println("Moon gravitation = " + moonGravitation );

        


    }
}
