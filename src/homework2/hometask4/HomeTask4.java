package homework2.hometask4;

import java.util.Scanner;

public class HomeTask4 {
    /**
     * 4. Given n (Input n from console). Write a program that prints "The number is prime" if the given number is prime,
     * otherwise it prints "The number is not prime".
     * (Note that the number is prime if it divides on 1 and on itself)
     */



        //Էս նայել էինք շուտ for ով պիտի անեք
        //n թիվը պարզա եթե ինքը չի բաժանվում [2 - n/2] միջակայքից ոչ մեկի վրա
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number : ");
            boolean isPrime = false;
            int num = scanner.nextInt();
            if (num < 2) {
                isPrime = false;
            } else {
                isPrime = true;
            }
            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }

        }
    }
