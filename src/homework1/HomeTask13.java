package homework1;


import java.util.Scanner;

public class HomeTask13 {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            System.out.print("number: ");
            double input = in.nextDouble();

            if (input == 0) {
                System.out.println("Zero");
            }else if (input > 0)
                {
                    System.out.println(" Positive");
                } else if (input < 0) {
                    System.out.println(" Negative");
                } else if (input > 1) {
                    System.out.println(" The module of a number is equal to a number");
                }else if (input < 1){
                System.out.println(" The negative module of a number is equal to a number");
            }


            }
        }
    }

