package homework2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number1 = input.nextInt();
        int value = number;
        for (int i = 1; i < number1; i++){
            value = value * number;
        }
        System.out.println(value);
    }
}
