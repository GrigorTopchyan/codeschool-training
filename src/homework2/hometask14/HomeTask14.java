package homework2.hometask14;

import java.util.Scanner;

public class HomeTask14 {
    /**
     * 14. Given firstNum(Input from console), secondNum(Input from console). Write java program that uses while loop
     * to perform following steps:
     * 1. Output all even numbers between firstNum and secondNum
     * 2. Output the sum of all odd numbers between firstNum and secondNum
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        int sumOdd = 0;
        while (firstNum <= secondNum) {
            if (firstNum % 2 != 0) {

                System.out.println(" even number " + firstNum);
                //else if պետք չի else ֊ ը հերիքա
            } else if (firstNum % 2 == 0) {
                sumOdd += firstNum;
            }


            firstNum++;
        }
        System.out.println("The sum of all odd numbers between firstNum and secondNum " + sumOdd);

    }
}
