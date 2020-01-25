package homework1;

import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            System.out.print("number: ");
            double input = in.nextDouble();

            if (input > 0)
            {
                if (input < 1)
                {
                    System.out.println(" small");
                }
                else if (input > 1000000)
                {
                    System.out.println(" large");
                }
                else
                {
                    System.out.println(" Positive");
                }
            }
            else if (input < 0)
            {
                if (Math.abs(input) < 1)
                {
                    System.out.println("Negative small");
                }
                else if (Math.abs(input) > 1000000)
                {
                    System.out.println(" Negative large");
                }
                else
                {
                    System.out.println(" Negative");
                }
            }
            else
            {
                System.out.println(" Zero");
            }
        }


    }
}
