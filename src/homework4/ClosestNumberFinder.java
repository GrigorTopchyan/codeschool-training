package homework4;

import java.util.Scanner;

public class ClosestNumberFinder {
    /**
     * 1.0 Գրել ծրագիր, որը կգտնի մուտքագրված թվին հաջորդող ամենամոտիկ պարզ թիվը․(Գրել մեթոդի օգնությամբ,
     * այսինքն գրել մեթոդ, որը կստանա ինչ որ թիվ և կվերադարձնի այդ թվին հաջորդող ամենամոտիկ պարզ թիվը)
     */
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(ClosestNumberFinder.closestNumber(number));

    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % 2 == 0) {
                return false;
            }

        }

        return true;
    }


    public static int closestNumber(int number) {
        int i = 1;
        while (true) {
            if (isPrime(number + i)) {
                return number + i;
            }
            i++;
        }


    }
}
